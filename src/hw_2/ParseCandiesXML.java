package hw_2;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class ParseCandiesXML {
    public static void main(String[] args) {
        List<Candy> candyList = parseCandies("src/hw_2/candies.xml");
        candyList.stream().forEach(System.out::println);
    }

    static List<Candy> parseCandies(String xmlFile) {
        List<Candy> candyList = new ArrayList<>();

        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            FileInputStream fileInputStream = new FileInputStream(xmlFile);
            XMLStreamReader reader = inputFactory.createXMLStreamReader(fileInputStream);
            Candy candy = null;
            String elementName = null;

            while (reader.hasNext()) {
                int eventType = reader.next();
                switch (eventType) {
                    case XMLStreamConstants.START_ELEMENT:
                        elementName = reader.getLocalName();
                        if (elementName.equals("candy")) {
                            candy = new Candy();
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        String text = reader.getText().trim();
                        if (text.isEmpty()) {
                            break;
                        }
                        if (elementName.equals("name")) {
                            candy.setName(text);
                        } else if (elementName.equals("description")) {
                            candy.setDescription(text);
                        } else if (elementName.equals("color")) {
                            candy.setColor(text);
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        elementName = reader.getLocalName();
                        if (elementName.equals("candy")) {
                            candyList.add(candy);
                        }
                        break;
                }
            }
        } catch (XMLStreamException | IOException e) {
            throw new RuntimeException(e);
        }
        return candyList;
    }
}

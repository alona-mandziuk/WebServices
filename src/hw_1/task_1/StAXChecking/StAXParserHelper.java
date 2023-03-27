package hw_1.task_1.StAXChecking;

import hw_1.task_1.entity.DepositType;

import javax.xml.namespace.QName;
import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class StAXParserHelper {
    public List<DepositType> getAll(String file) throws XMLStreamException, FileNotFoundException {

        DepositType deposit = null;
        List<DepositType> deposites = new ArrayList<>();

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(file));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();

                switch (startElement.getName().getLocalPart()) {
                    case "deposit":
                        deposit = new DepositType();
                        Attribute type = startElement.getAttributeByName(new QName("type"));
                        if (type != null) {
                            deposit.setType(type.getValue());
                        }
                        Attribute name = startElement.getAttributeByName(new QName("name"));
                        if (name != null) {
                            deposit.setName(name.getValue());
                        }
                        break;

                    case "country":
                        nextEvent = reader.nextEvent();
                        deposit.setCountry(nextEvent.asCharacters().getData());
                        break;
                    case "depositor":
                        nextEvent = reader.nextEvent();
                        deposit.setDepositor(nextEvent.asCharacters().getData());
                        break;
                    case "account_id":
                        nextEvent = reader.nextEvent();
                        deposit.setAccountId(nextEvent.asCharacters().getData());
                        break;
                    case "amount":
                        nextEvent = reader.nextEvent();
                        deposit.setAmount(Long.valueOf(nextEvent.asCharacters().getData()));
                        break;
                    case "profitability":
                        nextEvent = reader.nextEvent();
                        deposit.setProfitability(nextEvent.asCharacters().getData());
                        break;
                    case "time_constraints":
                        nextEvent = reader.nextEvent();
                        deposit.setTimeConstraints(nextEvent.asCharacters().getData());
                        break;
                }
            }
            if (nextEvent.isEndElement()) {
                EndElement endElement = nextEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("deposit")) {
                    deposites.add(deposit);
                }
            }

        }
        return deposites;
    }
}

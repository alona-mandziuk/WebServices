package hw_1.task_1.DOMchecking;

import hw_1.task_1.entity.DepositType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class DOMParserHelper {
    private Document document;

    public DOMParserHelper() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        document = documentBuilder.parse(String.valueOf(Paths.get("src\\hw_1\\task_1\\BankDeposites.xml")));
    }

    public List<DepositType> getAll() {
        List<DepositType> deposites = new ArrayList<>();

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                DepositType deposit = new DepositType();
                deposit.setType(node.getAttributes().getNamedItem("type").getNodeValue());
                deposit.setName(node.getAttributes().getNamedItem("name").getNodeValue());

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node childNode = childNodes.item(j);

                    if (childNode instanceof Element) {
                        String value = childNode.getLastChild().getTextContent().trim();

                        switch (childNode.getNodeName()) {
                            case "country":
                                deposit.setCountry(value);
                                break;
                            case "depositor":
                                deposit.setDepositor(value);
                                break;
                            case "account_id":
                                deposit.setAccountId(value);
                                break;
                            case "amount":
                                deposit.setAmount(Long.valueOf(value));
                                break;
                            case "profitability":
                                deposit.setProfitability(value);
                                break;
                            case "time_constraints":
                                deposit.setTimeConstraints(value);
                                break;
                        }
                    }
                }
                deposites.add(deposit);
            }
        }
        return deposites;
    }
}

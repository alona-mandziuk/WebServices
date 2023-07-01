package hw_3.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;


class ParseWithXPath {
    public static void main(String[] args) {
        try {
            parseWithXpath("src/hw_1/task_1/BankDeposites.xml");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void parseWithXpath(String xmlDoc) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlDoc);
        document.getDocumentElement().normalize();

        XPath xPath = XPathFactory.newInstance().newXPath();

        XPathExpression expression = xPath.compile("/bank/deposit");

        NodeList deposites = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < deposites.getLength(); i++) {
            Node node = deposites.item(i);
            System.out.println("\nDeposit " + (i + 1) + ":");

            if ((node.getNodeType() == Node.ELEMENT_NODE)) {
                Element element = (Element) node;
                System.out.println("Type: " + element.getAttribute("type"));
                System.out.println("Name: " + element.getAttribute("name"));
                System.out.println("Country: " + element
                        .getElementsByTagName("country")
                        .item(0)
                        .getTextContent());
                System.out.println("Depositor: " + element
                        .getElementsByTagName("depositor")
                        .item(0)
                        .getTextContent());
                System.out.println("Account id: " + element
                        .getElementsByTagName("account_id")
                        .item(0)
                        .getTextContent());
                System.out.println("Amount: " + element
                        .getElementsByTagName("amount")
                        .item(0)
                        .getTextContent());
                System.out.println("Profitability (%): " + element
                        .getElementsByTagName("profitability")
                        .item(0)
                        .getTextContent());
                System.out.println("Time constraints: " + element
                        .getElementsByTagName("time_constraints")
                        .item(0)
                        .getTextContent());
                System.out.println("---------------------");
            }
        }
    }
}

package hw_1.task_1;

import hw_1.task_1.entity.DepositType;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

class SAXParserHandler extends DefaultHandler {
    private List<DepositType> deposites;
    private String currentQName;
    private DepositType currentDeposite;
    private String currentAttribute;

    public SAXParserHandler() {
        deposites = new ArrayList<>();
    }

    public List<DepositType> getDeposites() {
        return deposites;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentQName = qName;

        if (attributes.getLength() > 0) {
            switch (qName) {
                case "deposit":
                    currentDeposite = new DepositType();
                    currentDeposite.setType(attributes.getValue(0));
                    currentDeposite.setName(attributes.getValue(1));
                    break;

            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentQName = " ";
        if (qName.equals("deposit")) {
            deposites.add(currentDeposite);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        switch (currentQName) {

            case "country":
                currentDeposite.setCountry(value);
                break;
            case "depositor":
                currentDeposite.setDepositor(value);
                break;
            case "account_id":
                currentDeposite.setAccountId(value);
                break;
            case "amount":
                currentDeposite.setAmount(Long.parseLong(value));
                break;
            case "profitability":
                currentDeposite.setProfitability(value);
                break;
            case "time_constraints":
                currentDeposite.setTimeConstraints(value);
                break;
        }
    }
}

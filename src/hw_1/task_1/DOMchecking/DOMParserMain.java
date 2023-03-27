package hw_1.task_1.DOMchecking;

import hw_1.task_1.SortListFromXML;
import hw_1.task_1.entity.DepositType;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

class DOMParserMain {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DOMParserHelper domParserHelper = new DOMParserHelper();

        List<DepositType> deposites = domParserHelper.getAll();

        SortListFromXML sortListFromXML = new SortListFromXML();
        sortListFromXML.sortAndPrintDepByAmount(deposites);
    }
}

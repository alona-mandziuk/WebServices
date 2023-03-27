package hw_1.task_1.StAXChecking;

import hw_1.task_1.SortListFromXML;
import hw_1.task_1.entity.DepositType;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.List;

class StAXParserMain {
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        StAXParserHelper stAXParserHelper = new StAXParserHelper();

        List<DepositType> deposites = stAXParserHelper.getAll("src/hw_1/task_1/BankDeposits.xml");

        SortListFromXML sortListFromXML = new SortListFromXML();
        sortListFromXML.sortAndPrintDepByAmount(deposites);
    }
}

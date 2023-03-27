package hw_1.task_1.SAXChecking;

import hw_1.task_1.SortListFromXML;
import hw_1.task_1.entity.DepositType;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class SAXParserMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXParserHandler saxParserHandler = new SAXParserHandler();
        Path path = Paths.get("src\\hw_1\\task_1\\BankDeposits.xml");

        parser.parse(String.valueOf(path), saxParserHandler);

        List<DepositType> deposites = saxParserHandler.getDeposites();

        SortListFromXML sortListFromXML = new SortListFromXML();
        sortListFromXML.sortAndPrintDepByAmount(deposites);
    }
}

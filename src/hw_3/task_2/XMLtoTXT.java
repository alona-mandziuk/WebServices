package hw_3.task_2;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLtoTXT {
    public static void main(String[] args) {
        Source xsltFile = new StreamSource
                ("src/hw_3/task_2/BankDepositesToTxt.xslt");
        Source xmlFile = new StreamSource
                ("src/hw_1/task_1/BankDeposites.xml");
        try {
            convertXMLtoTXT(xmlFile, xsltFile);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static void convertXMLtoTXT (Source xmlFile, Source xsltFile) throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        OutputStream htmlFile = new FileOutputStream("src/hw_3/task_2/BankDeposites.txt");

        transformerFactory.newTransformer(xsltFile).transform(xmlFile, new StreamResult(htmlFile));
    }
}

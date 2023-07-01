package hw_3.task_2;

import javax.xml.transform.Source;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

class XMLtoHTML {
    public static void main(String[] args) {
        Source xsltFile = new StreamSource
                ("src/hw_3/task_2/BankDepositesSortByAmount.xslt");
        Source xmlFile = new StreamSource
                ("src/hw_1/task_1/BankDeposites.xml");
        try {
            convertXMLtoHTML(xmlFile, xsltFile);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     Method converts XML using XSLT to HTML in table and sorts by amount sum.
     */
    static void convertXMLtoHTML (Source xmlFile, Source xsltFile) throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        OutputStream htmlFile = new FileOutputStream("src/hw_3/task_2/BankDeposites.html");

        transformerFactory.newTransformer(xsltFile).transform(xmlFile, new StreamResult(htmlFile));
    }
}

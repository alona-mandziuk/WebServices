package hw_3.task_2;

import com.aspose.pdf.Document;
import com.aspose.pdf.HtmlLoadOptions;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLtoPDF {


    public static void main(String[] args) {
        Source xslFile = new StreamSource
                ("src/hw_3/task_2/BankDepositesNewPage.xslt");
        Source xmlFile = new StreamSource
                ("src/hw_1/task_1/BankDeposites.xml");

        try {
            convertXMLtoPDF(xmlFile, xslFile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void convertXMLtoPDF(Source xmlFile, Source xslFile) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();

        OutputStream htmlFile = new FileOutputStream("src/hw_3/task_2/BankDepositesNewPage.html");

        transformerFactory.newTransformer(xslFile).transform(xmlFile, new StreamResult(htmlFile));

        HtmlLoadOptions htmlLoadOptions = new HtmlLoadOptions();

        Document pdf = new Document("src/hw_3/task_2/BankDepositesNewPage.html", htmlLoadOptions);
        pdf.save("src/hw_3/task_2/BankDepositesNewPage.pdf");
    }
}

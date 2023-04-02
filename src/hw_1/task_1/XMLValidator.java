package hw_1.task_1;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

class XMLValidator {
    static boolean xmlValidator(String pathXml, String pathXsd) {
        try {
            File xmlFile = new File(pathXml);
            File xsdFile = new File(pathXsd);

            if (!xmlFile.exists()) {
                System.err.println("File XML is not found by the path:" + pathXml);
            }
            if (!xsdFile.exists()) {
                System.err.println("File XSD is not found by the path:" + pathXsd);
            }
            if (!xmlFile.exists() || !xsdFile.exists()) {
                return false;
            }
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new StreamSource(pathXsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(pathXml));
            return true;
        } catch (SAXException | IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        boolean valid = XMLValidator.xmlValidator("src/hw_1/task_1/BankDeposites.xml",
                "src/hw_1/task_1/BankDeposites.xsd");
        System.out.println("---------------------------");
        System.out.println("Is XML valid according to XSD? - " + valid);
        System.out.println("---------------------------");
    }
}


package hw_3.task_3.entity;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hw_3.task_3.entity package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Bank_QNAME = new QName("", "bank");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hw_3.task_3.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BankType }
     * 
     */
    public BankType createBankType() {
        return new BankType();
    }

    /**
     * Create an instance of {@link DepositType }
     * 
     */
    public DepositType createDepositType() {
        return new DepositType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BankType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "bank")
    public JAXBElement<BankType> createBank(BankType value) {
        return new JAXBElement<BankType>(_Bank_QNAME, BankType.class, null, value);
    }

}

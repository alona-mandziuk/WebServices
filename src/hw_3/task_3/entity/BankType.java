package hw_3.task_3.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for bankType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="bankType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deposit" type="{}depositType" maxOccurs="30"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlRootElement(name = "bank")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankType", propOrder = {
        "deposit"
})
public class BankType implements Serializable {

    @XmlElement(required = true)
    protected List<DepositType> deposit;

    /**
     * Gets the value of the deposit property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deposit property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeposit().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositType }
     */
    public List<DepositType> getDeposit() {
        if (deposit == null) {
            deposit = new ArrayList<DepositType>();
        }
        return this.deposit;
    }

}

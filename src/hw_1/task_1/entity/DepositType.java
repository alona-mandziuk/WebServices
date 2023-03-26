
package hw_1.task_1.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depositType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depositType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Bikini Bottom"/&gt;
 *               &lt;enumeration value="Switzerland"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="depositor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SpongeBob SquarePants"/&gt;
 *               &lt;enumeration value="Patrick Star"/&gt;
 *               &lt;enumeration value="Sqiudward Tentacles"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="account_id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="26007777770001"/&gt;
 *               &lt;enumeration value="2600775550002"/&gt;
 *               &lt;enumeration value="262056848464"/&gt;
 *               &lt;enumeration value="26201345154654"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;enumeration value="2757"/&gt;
 *               &lt;enumeration value="1005"/&gt;
 *               &lt;enumeration value="20000"/&gt;
 *               &lt;enumeration value="50000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="profitability"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="10"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="time_constraints"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="no time constraints"/&gt;
 *               &lt;enumeration value="2 years"/&gt;
 *               &lt;enumeration value="5 years"/&gt;
 *               &lt;enumeration value="3 years"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositType", propOrder = {
    "country",
    "depositor",
    "accountId",
    "amount",
    "profitability",
    "timeConstraints"
})
public class DepositType {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String depositor;
    @XmlElement(name = "account_id", required = true)
    protected String accountId;
    protected long amount;
    @XmlElement(required = true)
    protected String profitability;
    @XmlElement(name = "time_constraints", required = true)
    protected String timeConstraints;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the depositor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositor() {
        return depositor;
    }

    /**
     * Sets the value of the depositor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositor(String value) {
        this.depositor = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the profitability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitability() {
        return profitability;
    }

    /**
     * Sets the value of the profitability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitability(String value) {
        this.profitability = value;
    }

    /**
     * Gets the value of the timeConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeConstraints() {
        return timeConstraints;
    }

    /**
     * Sets the value of the timeConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeConstraints(String value) {
        this.timeConstraints = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return "Deposit: country - " + country +
                ", \n\tdepositor - " + depositor +
                ", \n\taccountId " + accountId +
                ", \n\tamount - " + amount +
                ", \n\tprofitability - " + profitability +
                ", \n\ttime constraints - " + timeConstraints +
                ", \n\ttype - " + type +
                ", \n\tname - " + name + ".";
    }
}

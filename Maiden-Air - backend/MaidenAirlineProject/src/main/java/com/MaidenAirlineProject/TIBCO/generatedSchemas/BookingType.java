//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.10 at 04:01:38 PM BST 
//


package com.MaidenAirlineProject.TIBCO.generatedSchemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Cancel_Booking" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Change_Date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Checked_Baggage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Cost" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Hand_Baggage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Booking_Type", namespace = "http://www.tibco.com/schemas/MaidenAirways/Schemas/Schema.xsd7")
public class BookingType {

    @XmlAttribute(name = "Cancel_Booking")
    protected String cancelBooking;
    @XmlAttribute(name = "Change_Date")
    protected String changeDate;
    @XmlAttribute(name = "Checked_Baggage")
    protected String checkedBaggage;
    @XmlAttribute(name = "Cost")
    protected String cost;
    @XmlAttribute(name = "Hand_Baggage")
    protected String handBaggage;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    public BookingType() {}

    public BookingType(String cancelBooking, String changeDate, String checkedBaggage, String cost, String handBaggage, String id, String name) {
        this.cancelBooking = cancelBooking;
        this.changeDate = changeDate;
        this.checkedBaggage = checkedBaggage;
        this.cost = cost;
        this.handBaggage = handBaggage;
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the value of the cancelBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelBooking() {
        return cancelBooking;
    }

    /**
     * Sets the value of the cancelBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelBooking(String value) {
        this.cancelBooking = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDate(String value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the checkedBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedBaggage() {
        return checkedBaggage;
    }

    /**
     * Sets the value of the checkedBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedBaggage(String value) {
        this.checkedBaggage = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCost(String value) {
        this.cost = value;
    }

    /**
     * Gets the value of the handBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandBaggage() {
        return handBaggage;
    }

    /**
     * Sets the value of the handBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandBaggage(String value) {
        this.handBaggage = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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

}

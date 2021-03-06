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
 *       &lt;attribute name="Cargo_Hold_Capacity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Model" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Number_Seats" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Airplane", namespace = "http://www.tibco.com/schemas/MaidenAirways/Schemas/Schema.xsd2")
public class Airplane {

    @XmlAttribute(name = "Cargo_Hold_Capacity")
    protected String cargoHoldCapacity;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Model")
    protected String model;
    @XmlAttribute(name = "Number_Seats")
    protected String numberSeats;

    public Airplane() {}

    public Airplane(String cargoHoldCapacity, String id, String model, String numberSeats) {
        this.cargoHoldCapacity = cargoHoldCapacity;
        this.id = id;
        this.model = model;
        this.numberSeats = numberSeats;
    }

    /**
     * Gets the value of the cargoHoldCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoHoldCapacity() {
        return cargoHoldCapacity;
    }

    /**
     * Sets the value of the cargoHoldCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoHoldCapacity(String value) {
        this.cargoHoldCapacity = value;
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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the numberSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberSeats() {
        return numberSeats;
    }

    /**
     * Sets the value of the numberSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberSeats(String value) {
        this.numberSeats = value;
    }

}

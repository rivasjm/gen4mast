//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 01:08:01 PM CET 
//


package es.unican.istr.gen4mast.tool.xmlmodels.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Soft_Local_Deadline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Soft_Local_Deadline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Deadline" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Model}Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Soft_Local_Deadline")
public class SoftLocalDeadline {

    @XmlAttribute(name = "Deadline")
    protected Double deadline;

    /**
     * Gets the value of the deadline property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeadline(Double value) {
        this.deadline = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.19 at 05:12:38 PM CEST 
//


package es.unican.istr.gen4mast.tool.xmlmodels.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Global_Response_Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Global_Response_Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Referenced_Event" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}External_Reference" />
 *       &lt;attribute name="Time_Value" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Response_Time")
public class GlobalResponseTime {

    @XmlAttribute(name = "Referenced_Event", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referencedEvent;
    @XmlAttribute(name = "Time_Value", required = true)
    protected double timeValue;

    /**
     * Gets the value of the referencedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedEvent() {
        return referencedEvent;
    }

    /**
     * Sets the value of the referencedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedEvent(String value) {
        this.referencedEvent = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     */
    public double getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     */
    public void setTimeValue(double value) {
        this.timeValue = value;
    }

}

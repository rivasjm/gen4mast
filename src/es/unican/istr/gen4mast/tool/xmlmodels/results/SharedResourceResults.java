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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Shared_Resource_Results complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shared_Resource_Results">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Priority_Ceiling" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Priority_Ceiling" minOccurs="0"/>
 *         &lt;element name="Utilization" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Utilization" minOccurs="0"/>
 *         &lt;element name="Queue_Size" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Queue_Size" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Name" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shared_Resource_Results", propOrder = {

})
public class SharedResourceResults {

    @XmlElement(name = "Priority_Ceiling")
    protected PriorityCeiling priorityCeiling;
    @XmlElement(name = "Utilization")
    protected Utilization utilization;
    @XmlElement(name = "Queue_Size")
    protected QueueSize queueSize;
    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;

    /**
     * Gets the value of the priorityCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityCeiling }
     *     
     */
    public PriorityCeiling getPriorityCeiling() {
        return priorityCeiling;
    }

    /**
     * Sets the value of the priorityCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityCeiling }
     *     
     */
    public void setPriorityCeiling(PriorityCeiling value) {
        this.priorityCeiling = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     * @return
     *     possible object is
     *     {@link Utilization }
     *     
     */
    public Utilization getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utilization }
     *     
     */
    public void setUtilization(Utilization value) {
        this.utilization = value;
    }

    /**
     * Gets the value of the queueSize property.
     * 
     * @return
     *     possible object is
     *     {@link QueueSize }
     *     
     */
    public QueueSize getQueueSize() {
        return queueSize;
    }

    /**
     * Sets the value of the queueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueSize }
     *     
     */
    public void setQueueSize(QueueSize value) {
        this.queueSize = value;
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

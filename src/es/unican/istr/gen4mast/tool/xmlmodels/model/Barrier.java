//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 01:08:01 PM CET 
//


package es.unican.istr.gen4mast.tool.xmlmodels.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Barrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Barrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Output_Event" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Model}Identifier_Ref" />
 *       &lt;attribute name="Input_Events_List" use="required" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Model}Identifier_Ref_List" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Barrier")
public class Barrier {

    @XmlAttribute(name = "Output_Event", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputEvent;
    @XmlAttribute(name = "Input_Events_List", required = true)
    protected List<String> inputEventsList;

    /**
     * Gets the value of the outputEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputEvent() {
        return outputEvent;
    }

    /**
     * Sets the value of the outputEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputEvent(String value) {
        this.outputEvent = value;
    }

    /**
     * Gets the value of the inputEventsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputEventsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputEventsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputEventsList() {
        if (inputEventsList == null) {
            inputEventsList = new ArrayList<String>();
        }
        return this.inputEventsList;
    }

}

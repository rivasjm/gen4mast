//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 01:08:01 PM CET 
//


package es.unican.istr.gen4mast.tool.xmlmodels.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interrupt_FP_Policy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interrupt_FP_Policy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="The_Priority" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Model}Interrupt_Priority" />
 *       &lt;attribute name="Preassigned" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Model}Affirmative_Assertion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interrupt_FP_Policy")
public class InterruptFPPolicy {

    @XmlAttribute(name = "The_Priority")
    protected BigInteger thePriority;
    @XmlAttribute(name = "Preassigned")
    protected AffirmativeAssertion preassigned;

    /**
     * Gets the value of the thePriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThePriority() {
        return thePriority;
    }

    /**
     * Sets the value of the thePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThePriority(BigInteger value) {
        this.thePriority = value;
    }

    /**
     * Gets the value of the preassigned property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmativeAssertion }
     *     
     */
    public AffirmativeAssertion getPreassigned() {
        return preassigned;
    }

    /**
     * Sets the value of the preassigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmativeAssertion }
     *     
     */
    public void setPreassigned(AffirmativeAssertion value) {
        this.preassigned = value;
    }

}

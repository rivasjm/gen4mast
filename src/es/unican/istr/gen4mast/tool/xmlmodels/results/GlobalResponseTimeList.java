//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.19 at 05:12:38 PM CEST 
//


package es.unican.istr.gen4mast.tool.xmlmodels.results;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Global_Response_Time_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Global_Response_Time_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Global_Response_Time" type="{http://mast.unican.es/xmlmast/xmlmast_1_4/Mast_Result}Global_Response_Time" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Response_Time_List", propOrder = {
    "globalResponseTime"
})
public class GlobalResponseTimeList {

    @XmlElement(name = "Global_Response_Time", required = true)
    protected List<GlobalResponseTime> globalResponseTime;

    /**
     * Gets the value of the globalResponseTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalResponseTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalResponseTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalResponseTime }
     * 
     * 
     */
    public List<GlobalResponseTime> getGlobalResponseTime() {
        if (globalResponseTime == null) {
            globalResponseTime = new ArrayList<GlobalResponseTime>();
        }
        return this.globalResponseTime;
    }

}

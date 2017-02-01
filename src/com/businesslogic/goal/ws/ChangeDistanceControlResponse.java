
package com.businesslogic.goal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeDistanceControlResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDistanceControlResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceDistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDistanceControlResponse", propOrder = {
    "sentenceDistance"
})
public class ChangeDistanceControlResponse {

    protected String sentenceDistance;

    /**
     * Gets the value of the sentenceDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentenceDistance() {
        return sentenceDistance;
    }

    /**
     * Sets the value of the sentenceDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentenceDistance(String value) {
        this.sentenceDistance = value;
    }

}

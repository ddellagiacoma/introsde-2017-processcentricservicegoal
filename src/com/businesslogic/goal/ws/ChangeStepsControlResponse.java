
package com.businesslogic.goal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeStepsControlResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeStepsControlResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceSteps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeStepsControlResponse", propOrder = {
    "sentenceSteps"
})
public class ChangeStepsControlResponse {

    protected String sentenceSteps;

    /**
     * Gets the value of the sentenceSteps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentenceSteps() {
        return sentenceSteps;
    }

    /**
     * Sets the value of the sentenceSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentenceSteps(String value) {
        this.sentenceSteps = value;
    }

}

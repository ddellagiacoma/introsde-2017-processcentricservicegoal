
package com.businesslogic.goal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCaloriesControlResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCaloriesControlResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceCalories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCaloriesControlResponse", propOrder = {
    "sentenceCalories"
})
public class ChangeCaloriesControlResponse {

    protected String sentenceCalories;

    /**
     * Gets the value of the sentenceCalories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentenceCalories() {
        return sentenceCalories;
    }

    /**
     * Sets the value of the sentenceCalories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentenceCalories(String value) {
        this.sentenceCalories = value;
    }

}

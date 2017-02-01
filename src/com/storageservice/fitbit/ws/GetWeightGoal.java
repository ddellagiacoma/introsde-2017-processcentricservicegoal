
package com.storageservice.fitbit.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWeightGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeightGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="access_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refresh_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeightGoal", propOrder = {
    "accessToken",
    "userId",
    "refreshToken"
})
public class GetWeightGoal {

    @XmlElement(name = "access_token")
    protected String accessToken;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "refresh_token")
    protected String refreshToken;

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the refreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Sets the value of the refreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshToken(String value) {
        this.refreshToken = value;
    }

}

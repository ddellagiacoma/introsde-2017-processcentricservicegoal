
package com.businesslogic.goal.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeCaloriesControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCaloriesControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="access_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refresh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diffGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lifeStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diffCalories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCaloriesControl", propOrder = {
    "personId",
    "accessToken",
    "userId",
    "refresh",
    "diffGoal",
    "lifeStyle",
    "diffCalories",
    "calories"
})
public class ChangeCaloriesControl {

    protected int personId;
    @XmlElement(name = "access_token")
    protected String accessToken;
    protected String userId;
    protected String refresh;
    protected int diffGoal;
    protected String lifeStyle;
    protected int diffCalories;
    protected int calories;

    /**
     * Gets the value of the personId property.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

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
     * Gets the value of the refresh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefresh(String value) {
        this.refresh = value;
    }

    /**
     * Gets the value of the diffGoal property.
     * 
     */
    public int getDiffGoal() {
        return diffGoal;
    }

    /**
     * Sets the value of the diffGoal property.
     * 
     */
    public void setDiffGoal(int value) {
        this.diffGoal = value;
    }

    /**
     * Gets the value of the lifeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeStyle() {
        return lifeStyle;
    }

    /**
     * Sets the value of the lifeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeStyle(String value) {
        this.lifeStyle = value;
    }

    /**
     * Gets the value of the diffCalories property.
     * 
     */
    public int getDiffCalories() {
        return diffCalories;
    }

    /**
     * Sets the value of the diffCalories property.
     * 
     */
    public void setDiffCalories(int value) {
        this.diffCalories = value;
    }

    /**
     * Gets the value of the calories property.
     * 
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     */
    public void setCalories(int value) {
        this.calories = value;
    }

}


package com.businesslogic.goal.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.businesslogic.goal.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChangeStepsControl_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeStepsControl");
    private final static QName _ChangeWeightControl_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeWeightControl");
    private final static QName _ChangeCaloriesControlResponse_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeCaloriesControlResponse");
    private final static QName _ChangeDistanceControl_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeDistanceControl");
    private final static QName _ChangeCaloriesControl_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeCaloriesControl");
    private final static QName _ChangeWeightControlResponse_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeWeightControlResponse");
    private final static QName _ChangeStepsControlResponse_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeStepsControlResponse");
    private final static QName _ChangeDistanceControlResponse_QNAME = new QName("http://ws.goal.businesslogic.com/", "ChangeDistanceControlResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.businesslogic.goal.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeWeightControlResponse }
     * 
     */
    public ChangeWeightControlResponse createChangeWeightControlResponse() {
        return new ChangeWeightControlResponse();
    }

    /**
     * Create an instance of {@link ChangeStepsControlResponse }
     * 
     */
    public ChangeStepsControlResponse createChangeStepsControlResponse() {
        return new ChangeStepsControlResponse();
    }

    /**
     * Create an instance of {@link ChangeDistanceControlResponse }
     * 
     */
    public ChangeDistanceControlResponse createChangeDistanceControlResponse() {
        return new ChangeDistanceControlResponse();
    }

    /**
     * Create an instance of {@link ChangeStepsControl }
     * 
     */
    public ChangeStepsControl createChangeStepsControl() {
        return new ChangeStepsControl();
    }

    /**
     * Create an instance of {@link ChangeWeightControl }
     * 
     */
    public ChangeWeightControl createChangeWeightControl() {
        return new ChangeWeightControl();
    }

    /**
     * Create an instance of {@link ChangeCaloriesControlResponse }
     * 
     */
    public ChangeCaloriesControlResponse createChangeCaloriesControlResponse() {
        return new ChangeCaloriesControlResponse();
    }

    /**
     * Create an instance of {@link ChangeDistanceControl }
     * 
     */
    public ChangeDistanceControl createChangeDistanceControl() {
        return new ChangeDistanceControl();
    }

    /**
     * Create an instance of {@link ChangeCaloriesControl }
     * 
     */
    public ChangeCaloriesControl createChangeCaloriesControl() {
        return new ChangeCaloriesControl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStepsControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeStepsControl")
    public JAXBElement<ChangeStepsControl> createChangeStepsControl(ChangeStepsControl value) {
        return new JAXBElement<ChangeStepsControl>(_ChangeStepsControl_QNAME, ChangeStepsControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWeightControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeWeightControl")
    public JAXBElement<ChangeWeightControl> createChangeWeightControl(ChangeWeightControl value) {
        return new JAXBElement<ChangeWeightControl>(_ChangeWeightControl_QNAME, ChangeWeightControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCaloriesControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeCaloriesControlResponse")
    public JAXBElement<ChangeCaloriesControlResponse> createChangeCaloriesControlResponse(ChangeCaloriesControlResponse value) {
        return new JAXBElement<ChangeCaloriesControlResponse>(_ChangeCaloriesControlResponse_QNAME, ChangeCaloriesControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDistanceControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeDistanceControl")
    public JAXBElement<ChangeDistanceControl> createChangeDistanceControl(ChangeDistanceControl value) {
        return new JAXBElement<ChangeDistanceControl>(_ChangeDistanceControl_QNAME, ChangeDistanceControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCaloriesControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeCaloriesControl")
    public JAXBElement<ChangeCaloriesControl> createChangeCaloriesControl(ChangeCaloriesControl value) {
        return new JAXBElement<ChangeCaloriesControl>(_ChangeCaloriesControl_QNAME, ChangeCaloriesControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeWeightControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeWeightControlResponse")
    public JAXBElement<ChangeWeightControlResponse> createChangeWeightControlResponse(ChangeWeightControlResponse value) {
        return new JAXBElement<ChangeWeightControlResponse>(_ChangeWeightControlResponse_QNAME, ChangeWeightControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStepsControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeStepsControlResponse")
    public JAXBElement<ChangeStepsControlResponse> createChangeStepsControlResponse(ChangeStepsControlResponse value) {
        return new JAXBElement<ChangeStepsControlResponse>(_ChangeStepsControlResponse_QNAME, ChangeStepsControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDistanceControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.goal.businesslogic.com/", name = "ChangeDistanceControlResponse")
    public JAXBElement<ChangeDistanceControlResponse> createChangeDistanceControlResponse(ChangeDistanceControlResponse value) {
        return new JAXBElement<ChangeDistanceControlResponse>(_ChangeDistanceControlResponse_QNAME, ChangeDistanceControlResponse.class, null, value);
    }

}

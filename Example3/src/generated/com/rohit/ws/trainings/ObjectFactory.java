
package com.rohit.ws.trainings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rohit.ws.trainings package. 
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

    private final static QName _GetPolicyRequest_QNAME = new QName("http://trainings.ws.rohit.com/", "getPolicyRequest");
    private final static QName _CreatePolicyResponse_QNAME = new QName("http://trainings.ws.rohit.com/", "createPolicyResponse");
    private final static QName _GetPolicyResponse_QNAME = new QName("http://trainings.ws.rohit.com/", "getPolicyResponse");
    private final static QName _CreatePolicyRequest_QNAME = new QName("http://trainings.ws.rohit.com/", "createPolicyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rohit.ws.trainings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePolicyRequest }
     * 
     */
    public CreatePolicyRequest createCreatePolicyRequest() {
        return new CreatePolicyRequest();
    }

    /**
     * Create an instance of {@link GetPolicyResponse }
     * 
     */
    public GetPolicyResponse createGetPolicyResponse() {
        return new GetPolicyResponse();
    }

    /**
     * Create an instance of {@link GetPolicyRequest }
     * 
     */
    public GetPolicyRequest createGetPolicyRequest() {
        return new GetPolicyRequest();
    }

    /**
     * Create an instance of {@link CreatePolicyResponse }
     * 
     */
    public CreatePolicyResponse createCreatePolicyResponse() {
        return new CreatePolicyResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.rohit.com/", name = "getPolicyRequest")
    public JAXBElement<GetPolicyRequest> createGetPolicyRequest(GetPolicyRequest value) {
        return new JAXBElement<GetPolicyRequest>(_GetPolicyRequest_QNAME, GetPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.rohit.com/", name = "createPolicyResponse")
    public JAXBElement<CreatePolicyResponse> createCreatePolicyResponse(CreatePolicyResponse value) {
        return new JAXBElement<CreatePolicyResponse>(_CreatePolicyResponse_QNAME, CreatePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.rohit.com/", name = "getPolicyResponse")
    public JAXBElement<GetPolicyResponse> createGetPolicyResponse(GetPolicyResponse value) {
        return new JAXBElement<GetPolicyResponse>(_GetPolicyResponse_QNAME, GetPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.rohit.com/", name = "createPolicyRequest")
    public JAXBElement<CreatePolicyRequest> createCreatePolicyRequest(CreatePolicyRequest value) {
        return new JAXBElement<CreatePolicyRequest>(_CreatePolicyRequest_QNAME, CreatePolicyRequest.class, null, value);
    }

}

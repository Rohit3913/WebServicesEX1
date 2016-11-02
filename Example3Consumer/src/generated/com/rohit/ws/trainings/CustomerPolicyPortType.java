package com.rohit.ws.trainings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-11-02T21:13:07.848+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://trainings.ws.rohit.com/", name = "CustomerPolicyPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerPolicyPortType {

    @WebMethod
    @WebResult(name = "getPolicyResponse", targetNamespace = "http://trainings.ws.rohit.com/", partName = "parameters")
    public GetPolicyResponse getPolicy(
        @WebParam(partName = "parameters", name = "getPolicyRequest", targetNamespace = "http://trainings.ws.rohit.com/")
        GetPolicyRequest parameters
    );

    @WebMethod
    @WebResult(name = "createPolicyResponse", targetNamespace = "http://trainings.ws.rohit.com/", partName = "parameters")
    public CreatePolicyResponse createPolicy(
        @WebParam(partName = "parameters", name = "createPolicyRequest", targetNamespace = "http://trainings.ws.rohit.com/")
        CreatePolicyRequest parameters
    );
}

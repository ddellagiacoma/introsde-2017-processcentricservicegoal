package com.processcentric.goal.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public interface ProcessCentricGoal {

    @WebMethod(operationName="checkWeight")
    @WebResult(name="sentenceWeight")
    public String checkWeight(@WebParam(name="personId") int id, @WebParam(name="access_token") String access_token, @WebParam(name="userId") String userId, @WebParam(name="refresh") String refresh);

    @WebMethod(operationName="checkSteps")
    @WebResult(name="sentenceSteps") 
    public String checkSteps(@WebParam(name="personId") int id, @WebParam(name="access_token") String access_token, @WebParam(name="userId") String userId, @WebParam(name="refresh") String refresh);

    @WebMethod(operationName="checkCalories")
    @WebResult(name="sentenceCalories") 
    public String checkCalories(@WebParam(name="personId") int id, @WebParam(name="access_token") String access_token, @WebParam(name="userId") String userId, @WebParam(name="refresh") String refresh);

    @WebMethod(operationName="checkDistance")
    @WebResult(name="sentenceDistance") 
    public String checkDistance(@WebParam(name="personId") int id, @WebParam(name="access_token") String access_token, @WebParam(name="userId") String userId, @WebParam(name="refresh") String refresh);

}
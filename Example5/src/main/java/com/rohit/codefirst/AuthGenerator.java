package com.rohit.codefirst;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "AuthGenerator")
public interface AuthGenerator {

	public @WebResult(name = "AuthOutputResponse") AuthOutput getOTP(
			@WebParam(name = "AuthInputRequest") AuthInput input);
}

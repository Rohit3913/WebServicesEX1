package com.rohit.codefirst;

public class AuthGeneratorImp implements AuthGenerator {

	public AuthOutput getOTP(AuthInput input) {
		// TODO Auto-generated method stub
		int input1= (int) (input.getName().length()*Math.random());
		Double input2=Double.parseDouble(input.getPhoneNumber());
		String output=String.valueOf(input1*input2);
		AuthOutput authOutput = new AuthOutput();
		authOutput.setOtp(output);
		return authOutput;
	}

}

package com.rohit.codefirst;

public class AuthGeneratorImp implements AuthGenerator {

	public AuthOutput getOTP(AuthInput input) {
		// TODO Auto-generated method stub
		int input1= (int) (input.getName().length()*Math.random());
		String[] split = input.getPhoneNumber().split("");
		int sum=0;
		for (String value : split) {
			sum=Integer.valueOf(value)+sum;
		}
		
		String output=String.valueOf((int)input1*sum);
		AuthOutput authOutput = new AuthOutput();
		authOutput.setOtp(output);
		return authOutput;
	}

}

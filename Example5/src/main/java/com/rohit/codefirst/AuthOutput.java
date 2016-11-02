package com.rohit.codefirst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AuthenticationType")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthOutput {
	@XmlElement(name="oneTimePassword",required=true)
	String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}

package com.rohit.codefirst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AuthenticationInput")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthInput {
	@XmlElement(name="userName",required=true)
	String name;
	@XmlElement(name="userphoneNumber",required=true)
	String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

package com.info.jaxb;


import java.io.StringReader;
import java.io.StringWriter;
import java.rmi.UnmarshalException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.info2000.policy.Policy;
import org.info2000.policy.ProductType;

public class JAXBDemo {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Policy.class);
		
		Marshaller marshaller = context.createMarshaller();
		Policy policy = new Policy();
		policy.setPolicyNumber("004000001236524");
		policy.setPolicyStatus("A");
		policy.setProductType(ProductType.SW_100);
		StringWriter writer = new StringWriter();
		marshaller.marshal(policy, writer);
		String policyxml = writer.toString();
		System.out.println(policyxml);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Policy policy2=(Policy) unmarshaller.unmarshal(new StringReader(policyxml));
		System.out.println(policy2.getPolicyNumber());
	}

}

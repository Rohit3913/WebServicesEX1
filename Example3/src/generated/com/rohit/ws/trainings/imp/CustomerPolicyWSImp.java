package com.rohit.ws.trainings.imp;

import com.rohit.ws.trainings.Policy;
import com.rohit.ws.trainings.Product;

import java.util.HashMap;
import java.util.Map;

import com.rohit.ws.trainings.CreatePolicyRequest;
import com.rohit.ws.trainings.CreatePolicyResponse;
import com.rohit.ws.trainings.CustomerPolicyPortType;
import com.rohit.ws.trainings.GetPolicyRequest;
import com.rohit.ws.trainings.GetPolicyResponse;

public class CustomerPolicyWSImp implements CustomerPolicyPortType {
	
	public static Map<String, Policy> policies;
	static{
		policies = new HashMap<String, Policy>();
		Policy policy = new Policy();
		policy.setPolicyNumber("00400000251345");
		Product product1= new Product();
		product1.setDescription("An Awsome SW715 Product");
		product1.setStatus("A");
		product1.setType("SW715");
		policy.getProduct().add(product1);
		Product product2= new Product();
		product2.setDescription("An Awsome SW700 Product");
		product2.setStatus("A");
		product2.setType("SW700");
		policy.getProduct().add(product2);
		Product product3= new Product();
		product3.setDescription("An Awsome SW100 Product");
		product3.setStatus("A");
		product3.setType("SW100");
		policy.getProduct().add(product3);
		Product product4= new Product();
		product4.setDescription("An Awsome SW535 Product");
		product4.setStatus("A");
		product4.setType("SW535");
		policy.getProduct().add(product4);
		policies.put("00400000251345", policy);
	}

	public GetPolicyResponse getPolicy(GetPolicyRequest parameters) {
		// TODO Auto-generated method stub
		Policy policy = policies.get(parameters.getPolicyNumber());
		GetPolicyResponse response = new GetPolicyResponse();
		response.getPolicy().add(policy);
		return response;
	}

	public CreatePolicyResponse createPolicy(CreatePolicyRequest parameters) {
		// TODO Auto-generated method stub
		Policy policy = new Policy();
		policy.setPolicyNumber(parameters.getPolicyNumber());
		policy.getProduct().add(parameters.getProduct());
		CreatePolicyResponse response = new CreatePolicyResponse();
		policies.put(parameters.getPolicyNumber(),policy);
		response.setResult(true);
		return response;
	}

}

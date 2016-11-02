package com.rohit.ws.consumer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.rohit.ws.trainings.CustomerPolicyPortType;
import com.rohit.ws.trainings.CustomerPolicyService;
import com.rohit.ws.trainings.GetPolicyRequest;
import com.rohit.ws.trainings.GetPolicyResponse;
import com.rohit.ws.trainings.Policy;
import com.rohit.ws.trainings.Product;

public class TestingService {
	public static void main(String[] args) {
		try {
			CustomerPolicyService customerPolicyService = new CustomerPolicyService(
					new URL("http://localhost:8585/Example3/services/customerPolicies?wsdl"));
			CustomerPolicyPortType customerPolicyPort = customerPolicyService.getCustomerPolicyPort();
			GetPolicyRequest getPolicyRequest = new GetPolicyRequest();
			getPolicyRequest.setPolicyNumber("00400000251345");
			GetPolicyResponse policy = customerPolicyPort.getPolicy(getPolicyRequest);
			List<Policy> policy2 = policy.getPolicy();
			for (Policy policy3 : policy2) {
				List<Product> product = policy3.getProduct();
				for (Product product2 : product) {
					System.out.println(product2.getDescription() +" status "+product2.getStatus()+ "");
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

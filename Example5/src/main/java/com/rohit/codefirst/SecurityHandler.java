package com.rohit.codefirst;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;



public class SecurityHandler implements CallbackHandler {
	private Map<String, String> ldap;

	public SecurityHandler() {
		ldap= new HashMap<String, String>();
		ldap.put("rohit", "Chaudhari");
		ldap.put("Joan", "1234");
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		for (Callback callback : callbacks) {
			 WSPasswordCallback pc = (WSPasswordCallback) callback;

			String password = ldap.get(pc.getIdentifier());
			if (password != null) {
				pc.setPassword(password);
			}
		}

	}

}

package com.rohit.ws.trainings.handler;

import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SiteHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Handle Messages");
		Boolean isResponce = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(!isResponce){
			SOAPMessage message = context.getMessage();
			SOAPEnvelope envelope;
			try {
				envelope = message.getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				
				Iterator childElements = header.getChildElements();
				while(childElements.hasNext()){
					Node node = (Node) childElements.next();
					if(node.getLocalName()!=null)
						
					System.out.println(node.getLocalName() + "   " +node.getValue());
				}
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println("sending response");
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}

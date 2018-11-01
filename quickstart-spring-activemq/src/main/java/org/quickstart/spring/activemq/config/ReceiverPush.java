package org.quickstart.spring.activemq.config;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ReceiverPush implements MessageListener {

	public void onMessage(Message msg) {
		if(msg instanceof TextMessage){
			TextMessage text=(TextMessage)msg;
			try{
				System.out.println("receiver: "+text.getText());
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}else{
			System.out.println("warning,no TextMsg!");
		}
	}

}

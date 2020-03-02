package methodinjection.impl;

import javax.inject.Singleton;

import methodinjection.IMessageService;

@Singleton
public class EmailService implements IMessageService {

	@Override
	public boolean sendMessage(String msg) {
		System.out.println("Sending message " + msg + " using Email service.");
		return true;
	}

}

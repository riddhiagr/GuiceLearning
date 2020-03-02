package methodinjection.impl;

import javax.inject.Singleton;

import methodinjection.IMessageService;

@Singleton
public class FacebookService implements IMessageService {

	@Override
	public boolean sendMessage(String msg) {
		System.out.println("Sending message "+ msg+" using facebook service.");
		return true;
	}

}

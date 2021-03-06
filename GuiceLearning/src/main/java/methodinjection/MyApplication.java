package methodinjection;

import javax.inject.Inject;

public class MyApplication {

	private IMessageService service;
	
	@Inject
	public void setService(IMessageService service) {
		this.service = service;
	}
	
	public boolean sendMessage(String msg) {
		return this.service.sendMessage(msg);
	}
}

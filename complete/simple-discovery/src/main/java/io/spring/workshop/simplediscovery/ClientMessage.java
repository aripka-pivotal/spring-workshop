package io.spring.workshop.simplediscovery;

public class ClientMessage {

	private String client;
	private String message;
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ClientMessage(String client, String message) {
		this.client = client;
		this.message = message;
	}
	
	
	
}

package br.com.fernandoalmeida.bo;

public class HelloMessage {

	private String name;
	private String message;

	public HelloMessage(String name) {
		super();
		this.name = name;
		this.message = "Hello " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

}

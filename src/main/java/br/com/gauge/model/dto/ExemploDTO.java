package br.com.gauge.model.dto;

public class ExemploDTO {
	
	private String message;

	public ExemploDTO() { }

	public ExemploDTO(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
}

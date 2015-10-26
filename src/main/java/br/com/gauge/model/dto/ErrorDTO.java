package br.com.gauge.model.dto;

public class ErrorDTO {

	private String message;

	public ErrorDTO() { }

	public ErrorDTO(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

}

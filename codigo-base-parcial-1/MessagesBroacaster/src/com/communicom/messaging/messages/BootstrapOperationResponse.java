package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse extends Mensaje{
	private  String mensajeName;
	private String version;
	private int result;
	private int errorMessage;

	public BootstrapOperationResponse(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime);
	}

	public String getMensajeName() {
		return mensajeName;
	}

	public void setMensajeName(String mensajeName) {
		this.mensajeName = mensajeName;
	}

	public String getversion() {
		return version;
	}

	public void setversion(String version) {
		this.version = version;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(int errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "BootstrapOperationReponse \nmensajeName=" + mensajeName + "\nversion=" + version + "\n result=" + result
				+ "\nerrorMessage=" + errorMessage + super.toString();
	}

	
}

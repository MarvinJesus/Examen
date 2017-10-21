package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationRequest extends Mensaje{
	private  String mensajeName;
	private String version;

	public BootstrapOperationRequest(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime) {
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

	@Override
	public String toString() {
		return "BootstrapOperationRequest\nmensajeName=" + mensajeName + "\nversion=" + version +  super.toString();
	}
	
}

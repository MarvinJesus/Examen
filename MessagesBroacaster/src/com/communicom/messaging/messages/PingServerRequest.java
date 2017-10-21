package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Mensaje{

	public PingServerRequest(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime);
	}

	@Override
	public String toString() {
		return "PingServerRequest\n" + super.toString();
	}



	
}

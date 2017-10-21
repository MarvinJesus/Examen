package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Mensaje {

	public PingServerResponse(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime);
	}
	@Override
	public String toString() {
		return super.toString();
	}

}

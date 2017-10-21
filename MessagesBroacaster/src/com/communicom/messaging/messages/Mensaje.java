package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public  class Mensaje {
	
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	public Mensaje(int messageNumber, String sourceAddress, String targetAddress, LocalDateTime emisionTime) {
		super();
		this.messageNumber = messageNumber;
		this.sourceAddress = sourceAddress;
		this.targetAddress = targetAddress;
		this.emisionTime = emisionTime;
	}
	


	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	@Override
	public String toString() {
		return "\nmessageNumber=" + messageNumber + "\nsourceAddress=" + sourceAddress + "\ntargetAddress="
				+ targetAddress + "\nemisionTime=" + emisionTime ;
	}
}

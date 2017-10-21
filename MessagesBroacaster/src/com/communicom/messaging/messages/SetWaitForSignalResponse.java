package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends Mensaje{

	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse(int messageNumber, String sourceAddress, String targetAddress,
			LocalDateTime emisionTime) {
		super(messageNumber, sourceAddress, targetAddress, emisionTime);
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}

	@Override
	public String toString() {
		return "SetWaitForSignalResponse\nsignal=" + signal + "\nsignalExpectedValue=" + signalExpectedValue
				+ "\nsignalReceivedValue=" + signalReceivedValue + super.toString();
	}
}

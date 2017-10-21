package com.communicomm.messaging.fabrica;

import java.time.LocalDateTime;
import java.time.Month;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Mensaje;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicomm.messaging.enun.TypeMessag;

public class FabricaMensajes {
	public static Mensaje crearMensaje(TypeMessag type) {
		switch(type){
		case PingServerRequest:	
			return new PingServerRequest(1, "1-000-yyt-444-", "deede-323234-4344r5t-w", LocalDateTime.now() );
		case PingServerResponse:	
			return new PingServerResponse(2, "1-000-yt-444-", "deede-234-4344r5t-w", LocalDateTime.now() );
		case SetWaitForSignalRequest:	
			return new SetWaitForSignalRequest(3, "1--yyt-444-", "deede-3344r5t-w", LocalDateTime.now() );
		case SetWaitForSignalResponse:	
			return new SetWaitForSignalResponse(4, "1-000-yyt-444-", "d3234-4344r5t-w", LocalDateTime.now() );
		case BootstrapOperationRequest:	
			return new BootstrapOperationRequest(5, "1-ght000-yyt-444-", "dr5tt5234-4344r5t-w", LocalDateTime.now() );
		case BootstrapOperationResponse:	
			return new BootstrapOperationResponse(6, "3frg-00-yyt-444-", "d3234-43tg5t54r5t-w", LocalDateTime.now() );
					
		default:
					return null;
			
		}
		
		
	}

}

package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Mensaje;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicomm.messaging.enun.TypeMessag;
import com.communicomm.messaging.fabrica.FabricaMensajes;

public class MessageController {
	private ArrayList<Mensaje>listaMensajes = new ArrayList<Mensaje>();

	
	public void sendMessage(int messageOption) {
		listaMensajes.add(FabricaMensajes.crearMensaje(TypeMessag.values()[messageOption-1]));
		
	}

	public void listMessage() {
		
		for (Mensaje currentRequest: listaMensajes){
			System.out.println("**********************************************");
			System.out.println(currentRequest.toString());
			System.out.println("\n**********************************************");
			
		}
		
	}

}

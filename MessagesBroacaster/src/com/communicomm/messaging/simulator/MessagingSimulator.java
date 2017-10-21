package com.communicomm.messaging.simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import com.communicomm.messaging.messages.controller.MessageController;

public class MessagingSimulator {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static MessageController messageController = new MessageController();
	
	
	public static void main(String[] args) throws Exception{
		processUI();
	}

	private static void processUI() throws Exception{
		int option = 0;
		do {
			printOptions();
			option = getAction();
			processOption(option);
		} while (option != 4);
	}

	private static void printOptions() {
		System.out.println("MESSAGING SIMULATOR V1.0");
		System.out.println("1. Simulate Message");
		System.out.println("2. List simulated messages");
		System.out.println("3. Exit");
	}

	private static int getAction() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			JOptionPane.showMessageDialog(null, "Dato No valido", "Error", JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
		return 0;
	}
	

	private static void processOption(int option) throws Exception  {
		
		if (option == 1){
			int messageOption = askForOptions();
			messageController.sendMessage(messageOption);	
		}else if (option == 2){
			messageController.listMessage();	
		}
		
	}

	private static int askForOptions() throws Exception {
		System.out.println("1. Ping Server Request");
		System.out.println("2. Ping Server Response");
		System.out.println("3. Set Wait For Signal Request");
		System.out.println("4. Set Wait For Signal Response");
		System.out.println("5. Bootstrap Operation Request");
		System.out.println("6. Bootstrap Operation Response");
		return Integer.parseInt(br.readLine());
	}	
	
}

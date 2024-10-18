package com.tka.client;

import java.util.List;

import com.tka.controller.IPLcontroller;
import com.tka.utility.Player;

public class IPLClient {
	
	
	public static void main(String[] args) {
		System.out.println("we are in IPl client");
		IPLcontroller controller=null;
		controller=new IPLcontroller();
		List<Player> allplayerList=controller.getAllPlayer();
		System.out.println(allplayerList);
	}
	

}

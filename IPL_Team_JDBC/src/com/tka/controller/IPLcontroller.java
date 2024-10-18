package com.tka.controller;

import java.util.List;

import com.tka.service.IPLservice;
import com.tka.utility.Player;


public class IPLcontroller {
    IPLservice service=null;
	public List<Player> getAllPlayer() {
		System.out.println("we are in IPL controller");
		service= new IPLservice();
		List<Player>allplayerList=service.getAllPlayer();
		return allplayerList;
	
		
		

	}

	

	
	}

	


package com.tka.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.utility.Player;

public class IPLservice {
	IPLDao dao=null;
	List<Player> allplayersList=new ArrayList();
	public List<Player>getAllPlayer(){
		System.out.println("we are in IPL service");
		dao=new IPLDao();
		
			try {
				allplayersList = dao.getAllPlayer();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return allplayersList;
	}

}

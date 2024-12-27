package com.tka.Sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.dao.TeamDao;
import com.tka.module.Player;

@Service
public class PlayerSevices {
	@Autowired
	PlayerDao playerDao;

	public String addPlayer(Player player) {
		String msg = playerDao.addPlayer(player);

		return msg;

	}

	public List<Player> getallPlayer() {

		List<Player> all = playerDao.getallPlayer();

		return all;

	}

	public Player getPlayerByid(int id) {
		return playerDao.getPlayerByid(id);
	}

	public String updatePlayer(int id, Player player) {
     
		
		return playerDao.updatePlayer( id,  player);
		
		
		
		
	}
	public String deleteplayer(int id) {
		return playerDao.deleteplayer(id);
		
	}
	


}

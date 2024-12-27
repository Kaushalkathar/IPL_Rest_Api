package com.tka.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.module.Player;

@Repository
public class PlayerDao {

	List<Player> players = new ArrayList<Player>();

	public PlayerDao() {
		players.add(new Player(45, "rohit Sharma", 35, 1, "Batsmman"));
		players.add(new Player(7, "Ms Dhoni", 40, 2, "WiketKeepar"));

	}

	public String addPlayer(Player player) {
		players.add(player);
		return "added";

	}

	public List<Player> getallPlayer() {
		return players;

	}

	public Player getPlayerByid(int id) {

		for (Player player1 : players) {
			if (player1.getPlayerId() == id) {
				return player1;
			}

		}
		return null;

	}

	public String updatePlayer(int id, Player player) {
		for (int i = 0; i < players.size(); i++) {
			Player player2 = players.get(i);
			if (player2.getPlayerId() == id) {
				players.set(i, player);
				return "okay";

			}
		}
		return "not okay";

	}

	public String deleteplayer(int id) {

		for (int i = 0; i < players.size(); i++) {
			Player player2 = players.get(i);
			if (player2.getPlayerId() == id) {
				players.remove(i);
				return "Deleted Succesfully";

			}
		}
		return "not ";

	}
	
	

}

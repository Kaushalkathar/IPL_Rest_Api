package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.module.Team;

@Repository
public class TeamDao {

	List<Team> teams = new ArrayList<Team>();

public TeamDao() {
	teams.add(new Team(1, "MI", "MUM", "Mahela"));
	teams.add(new Team(2, "RCB", "Banglore", "Victory"));
}

	public String addteam(Team team) {
		teams.add(team);

		return "added";

	}

	public List<Team> allteam() {
		return teams;
	}

	public Team teambyid(int id) {
		for (Team team1 : teams) {
			if (team1.getTeamId() == id) {
				return team1;
			}
		}
		return null;
	}

	public void updatebyid(int id, Team update) {
		for (int i = 0; i < teams.size(); i++) {
			Team listteam = teams.get(i);
			if (listteam.getTeamId() == id) {
				teams.set(i, update);
			}
		}

	}

	public void deleteteambyid(int id) {
		for (int i = 0; i < teams.size(); i++) {
			Team deleteteam = teams.get(i);
			if (deleteteam.getTeamId() == id) {
				teams.remove(i);
			}
		}
	}

	public String deleteteam(int id) {
		for (int i = 0; i < teams.size(); i++) {
			Team deleteteam = teams.get(i);

			if (deleteteam.getTeamId() == id) {
				teams.remove(deleteteam);
				return "delete sucessfully";
			}
		}
		return "try again";
	}

	public String updateteam(int id, Team team) {
		for (int i = 0; i < teams.size(); i++) {
			Team update = teams.get(i);

			if (update.getTeamId() == id) {
				teams.set(i, team);
				return "okay";
			}
		}
		return "not found";

	}

}

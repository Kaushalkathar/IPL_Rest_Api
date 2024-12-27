package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Sevices.TeamServices;
import com.tka.module.Team;

@RestController
public class TeamController {

	@Autowired
	TeamServices teamServices;

	@PostMapping("/api/teams")
	public String addteam(@RequestBody Team team) {

		String msg = teamServices.addteam(team);
		return msg;

	}

	@GetMapping("api/teams")

	public List<Team> allteams() {
		List<Team> msg = teamServices.allteam();
		return msg;

	}

	@GetMapping("api/teams/id")
	public Object teambyid(@RequestParam int id) {
		Team teambyid = teamServices.teambyid(id);

		if (teambyid != null) {
			return teambyid;
		} else {
			return "team not found";
		}

	}

	@PutMapping("api/teams/{teamId}")
	public void updateteambyid(@PathVariable("teamId") int id, @RequestBody Team update) {
		teamServices.updatebyid(id, update);

	}

	@DeleteMapping("api/team/")
	public void deleteteambyid(@RequestParam int id) {
		teamServices.deleteteambyid(id);
	}

	@DeleteMapping("api/team/{id}")
	public String deleteteam(@PathVariable("id") int id) {

		return teamServices.deleteteam(id);

	}

	@PutMapping("api/teams")
	public String updateteam(@RequestParam int id, @RequestBody Team team) {

		return teamServices.updateteam(id, team);

	}
 
}

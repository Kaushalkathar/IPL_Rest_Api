package com.tka.Sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.module.Team;

@Service
public class TeamServices {
	@Autowired
	TeamDao teamDao;

	public String addteam(Team team) {

		String msg = teamDao.addteam(team);

		return msg;

	}
	public List<Team> allteam()
	{
		List<Team> msg = teamDao.allteam();
		return msg;
		
	}
	
	public Team teambyid(int id)
	{
		Team teambyid = teamDao.teambyid(id);
		return teambyid;
	}
	
	public void updatebyid(int id, Team update)
	{
		 teamDao.updatebyid(id, update);
	}
	
	public void deleteteambyid(int id)
	{
		teamDao.deleteteambyid(id);
	}
	
	public String deleteteam(int id)
	{
		String deleteteam = teamDao.deleteteam(id);
		return deleteteam;
		
	}
	
	public String updateteam(int id, Team team)
	{
		String msg = teamDao.updateteam(id, team);
		return msg;
		
	}

}

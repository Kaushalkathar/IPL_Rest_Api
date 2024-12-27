package com.tka.Sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.MatchDao;
import com.tka.module.Match;
@Service
public class MatchService {

	
	@Autowired
	MatchDao matchdao;
	
	public String addmatch(Match match)
	{
		String addmatch = matchdao.addmatch(match);
		return addmatch;
	}
	
	public List<Match> allmatches()
	{
		return matchdao.allmatches();		
	}
	
	public Match matchbyid(int id) {
		
		return matchdao.matchbyid(id);
	}
	

	public String updatematch(int id, Match match) {
		// TODO Auto-generated method stub
		 return matchdao.updatematch(id, match);
	}

	public String deletematch(int id)
	{
		return matchdao.deletematch(id);
		
	}

	

}


package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tka.module.Match;

@Repository
public class MatchDao {
	
List<Match> matchlist = new ArrayList<Match>();
	
	public MatchDao() {
		matchlist.add(new Match(1, "Mumbai", "RCB", "1-1-24", "Wankhede", "Mumbai Won"));
		matchlist.add(new Match(2, "CSK", "DC", "15-9-24", "Chepauk", "DC won"));
	}
	
	public String addmatch(Match match)
	{
		matchlist.add(match);
		return "Match Added";
	}
	
	public List<Match> allmatches()
	{
		return matchlist;
	}
	
	public Match matchbyid(int id)
	{
		for (Match match : matchlist) {
			if (match.getMatchId() == id){
				return match;
			}
		}
		return null;
	}
	

	public String updatematch(int id, Match match) {
	for (int i = 0; i < matchlist.size(); i++) {
			
			Match matchid = matchlist.get(i);
			
			if (matchid.getMatchId()==id) {
				matchlist.set(i, match);
				return "okay";
			}
			
		}
		return "not found";
	}
	
	public String deletematch(int id)
	{
		for (int i = 0; i < matchlist.size(); i++) {
			Match match = matchlist.get(i);
			
			if (match.getMatchId() == id) {
				matchlist.remove(match);
				return "okay";
			}
			
		}
		return "not okay";
		
	}
	

}

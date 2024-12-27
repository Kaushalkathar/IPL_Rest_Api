package com.tka.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Sevices.MatchService;
import com.tka.module.Match;

@RestController
public class MatchController {
	@Autowired
	MatchService matchservice;

	@PostMapping("api/matches")
	public String addmatch(@RequestBody Match match) {
		String addmatch = matchservice.addmatch(match);
		System.out.println(addmatch);
		return addmatch;

	}

	@GetMapping("api/matches")
	public List<Match> allmatches() {
		return matchservice.allmatches();

	}

	@GetMapping("api/matches/{id}")

	public Object matchbyid(@PathVariable("id") int id) {
		Match matchbyid = matchservice.matchbyid(id);

		if (matchbyid != null) {
			return matchbyid;
		} else {
			return "not found";
		}

	}
	
	@PutMapping("api/match/{id}")
	
	public String updatematch(@PathVariable("id") int id, @RequestBody Match match)
	{
		return matchservice.updatematch(id, match);
		
	}
	
	@DeleteMapping("api/match/{id}")
	public String deletematch(@PathVariable("id") int id)
	{
		return matchservice.deletematch(id);
		
	}
}

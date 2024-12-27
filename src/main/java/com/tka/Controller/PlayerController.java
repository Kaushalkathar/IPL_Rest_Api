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

import com.tka.Sevices.PlayerSevices;
import com.tka.module.Player;

@RestController
public class PlayerController {

	
	@Autowired
	PlayerSevices playerSevices;
	
	@PostMapping("api/players")
	public  String addPlayer(@RequestBody Player player) {
		String msg = playerSevices.addPlayer(player);
		return msg;
		
	}
	@GetMapping("api/players")
		public List<Player> getallPlayer(){
		    List<Player> all = playerSevices.getallPlayer();
		    return all;
		
			
		}
	@GetMapping("api/players/{id}")
	public Object getPlayerByid(@PathVariable("id") int id) {
	   Player getPlayerbyid = playerSevices. getPlayerByid(  id);
	   if (getPlayerbyid!=null) {
		return getPlayerbyid;
	}
	   else {
		
	
		
		return "not found";
		
	   }
	   }
	
	
	@PutMapping("api/players/{id}")
	public String updatePlayer(@PathVariable int id ,@RequestBody Player player) {
		return playerSevices.updatePlayer(id , player);
		
	}
	@DeleteMapping("api/players/{id}")

	public String deleteplayer(@PathVariable int  id) {
		return playerSevices.deleteplayer(id);
		
	}
	
}

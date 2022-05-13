package com.playersdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.playersdatabase.bean.Players;
import com.playersdatabase.service.PlayersService;


@RestController
public class PlayersController {
	
	@Autowired
	private PlayersService ps;
	
	@GetMapping("/players")
	public List<Players> getAllPlayers()
	{
		return ps.getAllPlayers();
	}
	
	@GetMapping("/players/{playerName}")
	public Players getPlayers(@PathVariable("playerName")String playerName)
	{
		return ps.getPlayersbyId(playerName);
	}

	@PostMapping("/players")
	public void createPlayer(@RequestBody Players player)
	{
		ps.createPlayer(player);
		//return player.getPlayerName();
	}
	
	@PutMapping("/players/{playerName}")
	public void updatePlayer(@PathVariable("playerName") String playerName,@RequestBody Players player)
	{
		ps.updatePlayer(playerName,player);
	}
	
	@DeleteMapping("/players/{playerName}")
	public void deletePlayer(@PathVariable("playerName") String playerName,@RequestBody Players player)
	{
		ps.deletePlayer(playerName);
	}
	
	
	
	
}

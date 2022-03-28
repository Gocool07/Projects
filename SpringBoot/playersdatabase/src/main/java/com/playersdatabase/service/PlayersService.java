package com.playersdatabase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playersdatabase.bean.Players;
import com.playersdatabase.repository.PlayersRepository;

@Service
public class PlayersService {
	
	@Autowired
	public PlayersRepository playerRepo;
	
	public List<Players> getAllPlayers()
	{
		List<Players> players=new ArrayList<>();
		playerRepo.findAll().forEach(players::add);
		return players;
	}
	
	public Players getPlayersbyId(String playerName)
	{
		return playerRepo.findById(playerName).get();
	}	
	public void createPlayer(Players player)
	{
		playerRepo.save(player);
	}
	
	public void updatePlayer(String playerName,Players player)
	{
		playerRepo.save(player);
	}
	
	public void deletePlayer(String playerName)
	{
		playerRepo.deleteById(playerName);
	}

}

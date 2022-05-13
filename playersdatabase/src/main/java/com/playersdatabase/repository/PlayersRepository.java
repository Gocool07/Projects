package com.playersdatabase.repository;

import org.springframework.data.repository.CrudRepository;

import com.playersdatabase.bean.Players;

public interface PlayersRepository extends CrudRepository<Players, String > {

}

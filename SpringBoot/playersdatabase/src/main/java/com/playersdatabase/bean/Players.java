package com.playersdatabase.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Players {
	@Id
	private String playerName;
	private int playerAge;
	private String playerNation;
	private String playerClub;
	private int matches;
	private int goals;
	
	
	

}

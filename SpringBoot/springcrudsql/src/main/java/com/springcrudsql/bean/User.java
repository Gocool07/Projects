package com.springcrudsql.bean;

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

public class User 
{
	@Id
	private long userId;
	private String userName;
	private String userMailId;
	private String userAddress;


}

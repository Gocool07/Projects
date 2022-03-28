package com.springcrudsql.repository;

import org.springframework.data.repository.CrudRepository;

import com.springcrudsql.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

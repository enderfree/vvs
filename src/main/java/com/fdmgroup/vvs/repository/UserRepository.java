package com.fdmgroup.vvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.vvs.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

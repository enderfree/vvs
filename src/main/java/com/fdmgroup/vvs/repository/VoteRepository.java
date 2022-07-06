package com.fdmgroup.vvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.vvs.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Integer>{

}

package com.fdmgroup.vvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.vvs.model.Poll;

public interface PollRepository extends JpaRepository<Poll, Integer>{

}

package com.fdmgroup.vvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.vvs.repository.VoteRepository;

@Service
public class VoteService {
	private VoteRepository voteRepository;

	@Autowired
	public VoteService(VoteRepository voteRepository) {
		super();
		this.voteRepository = voteRepository;
	}
	
}

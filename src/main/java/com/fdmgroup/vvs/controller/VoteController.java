package com.fdmgroup.vvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.vvs.service.VoteService;

@RestController
public class VoteController {
	private VoteService voteService;

	@Autowired
	public VoteController(VoteService voteService) {
		super();
		this.voteService = voteService;
	}

	public List<Vote> getAllVotes() {
		return voteService.getVotes();
	}

	public Vote getVote(int id) {
		return voteService.getVote(id);
	}

	public void createVote(Vote incomingVote) {
		return voteService.createVote(incomingVote);
	}

	public void deleteVote(int id) {
		voteService.deleteVote(id);
	}

	public List<Vote> getVotesById(int candidateId) {
		voteService.getVoteById(candidateId);
	}
}

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
	
	public List<Vote> getVotes() {
		return voteRepository.findAll();
	}

	public Vote getVote(int id) {
		return voteRepository.findById(id);
	}

	public void createVote(Vote incomingVote) {
		voteRepository.save(incomingVote);
	}

	public void deleteVote(int id) {
		voteRepository.deleteById(id);
	}

	public List<Vote> getVotesByCandidateId(int candidateId) {
		voteRepository.getVotesByCandidateId(candidateId);
	}
}

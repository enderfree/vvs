package com.fdmgroup.vvs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fdmgroup.vvs.model.Candidate;
import com.fdmgroup.vvs.model.CandidatePosition;
import com.fdmgroup.vvs.repository.CandidateRepository;

@Service
public class CandidateService {
	private CandidateRepository candidateRepository;
	
	@Autowired
	public CandidateService(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}
	public List<Candidate> retrieveAllCandidats() {
		return candidateRepository.findAll();
	}

	public Candidate retrieveCandidateById(int candidateId) throws CandidateNotFoundException {
		Optional<Candidate> candidate = candidateRepository.findById(candidateId);
		if(!candidate.isPresent()) {
			throw new CandidateNotFoundException(candidateId+" is not found");
		}
		return candidate.get();
	}
	public Candidate retrieveCandidateByCandidatePosition(CandidatePosition candidatePosition) {
		return null;
		
	}
	public Candidate addCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	public Candidate updateCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);
	}

	public void deleteCandidate(int candidateId) {
		candidateRepository.deleteById(candidateId);
	}

}

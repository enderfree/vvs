package com.fdmgroup.vvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.vvs.repository.CandidateRepository;

@Service
public class CandidateService {
	private CandidateRepository candidateRepository;
	
	@Autowired
	public CandidateService(CandidateRepository candidateRepository) {
		super();
		this.candidateRepository = candidateRepository;
	}
}

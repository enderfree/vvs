package com.fdmgroup.vvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.vvs.service.CandidatePositionService;

@RestController
public class CandidatePositionController {
	private CandidatePositionService candidatePositionService;

	@Autowired
	public CandidatePositionController(CandidatePositionService candidatePositionService) {
		super();
		this.candidatePositionService = candidatePositionService;
	}
}

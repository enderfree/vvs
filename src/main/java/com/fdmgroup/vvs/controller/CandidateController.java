package com.fdmgroup.vvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.vvs.service.CandidateService;

@RestController
public class CandidateController {
	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
}

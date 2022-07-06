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
}

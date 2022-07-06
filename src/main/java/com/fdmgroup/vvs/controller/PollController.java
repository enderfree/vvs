package com.fdmgroup.vvs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fdmgroup.vvs.repository.PollRepository;

@RestController
public class PollController {
	private PollRepository pollRepository;

	@Autowired
	public PollController(PollRepository pollRepository) {
		super();
		this.pollRepository = pollRepository;
	}
}

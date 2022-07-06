package com.fdmgroup.vvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.vvs.repository.PollRepository;

@Service
public class PollService {
	private PollRepository pollRepository;

	@Autowired
	public PollService(PollRepository pollRepository) {
		super();
		this.pollRepository = pollRepository;
	}
	
}

package com.fdmgroup.vvs.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.vvs.model.Poll;
import com.fdmgroup.vvs.service.PollService;

@RestController
@RequestMapping("/api/v1/polls")
public class PollController {
	private PollService pollService;

	@Autowired
	public PollController(PollService pollService) {
		super();
		this.pollService = pollService;
	}
	
	@GetMapping
	public List<Poll> getPolls(){
		return pollService.retrievePolls();
	}
	
	@GetMapping("/{id}")
	public Poll getPoll(@Valid@PathVariable long id) {
		return pollService.retrievePoll(id);
	}
	
	@PostMapping
	public ResponseEntity<Poll> createPoll(@Valid@RequestBody Poll poll){
		Poll createdPoll = pollService.createPoll(poll);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(createdPoll.getPollId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Poll> updatePoll(@PathVariable long id, @Valid@RequestBody Poll poll){
		pollService.updatePoll(id, poll);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public void deletePoll(@PathVariable long id) {
		pollService.deletePollById(id);
	}
}

package com.fdmgroup.vvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.vvs.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}

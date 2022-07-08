package com.fdmgroup.vvs.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Vote {
	@Id
	@SequenceGenerator(name = "VOTE_SEQ", sequenceName = "VOTE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOTE_SEQ")
	@Column(name = "VOTE_ID")
	private int voteId;
//	@OneToOne
//	@JoinColumn(name = "FK_CANDIDATE_ID")
//	private Candidate candidate;
	private Date date;
	@OneToOne
	@JoinColumn(name = "FK_USER_ID")
	private User voter;
	@ManyToOne
	@JoinColumn(name = "FK_POLL_ID")
	private Poll poll;
	
	@ManyToMany
	@JoinTable(name = "CANDIDATES_USERS",
	joinColumns = 
	@JoinColumn(name="voteid"),
	inverseJoinColumns = 
	@JoinColumn(name = "userid")
			)
	private List<User> candidates;
	
	
	
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vote(int voteId, Date date, User voter, Poll poll) {
		super();
		this.voteId = voteId;
//		this.candidate = candidate;
		this.date = date;
		this.voter = voter;
		this.poll = poll;
	}
	public Vote(int voteId, User voter, Poll poll) {
		super();
		this.voteId = voteId;
//		this.candidate = candidate;
		this.voter = voter;
		this.poll = poll;
		this.date = new Date();
	}
	/**
	 * @return the poll
	 */
	public Poll getPoll() {
		return poll;
	}
	/**
	 * @param poll the poll to set
	 */
	public void setPoll(Poll poll) {
		this.poll = poll;
	}
	@Override
	public String toString() {
		return "Vote [voteId=" + voteId +  ", date=" + date + ", voter=" + voter + "]";
	}
	/**
	 * @return the voteId
	 */
	public int getVoteId() {
		return voteId;
	}
	/**
	 * @param voteId the voteId to set
	 */
	public void setVoteId(int voteId) {
		this.voteId = voteId;
	}
	/**
	 * @return the candidate
	 */
//	public Candidate getCandidate() {
//		return candidate;
//	}
//	/**
//	 * @param candidate the candidate to set
//	 */
//	public void setCandidate(Candidate candidate) {
//		this.candidate = candidate;
//	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the voter
	 */
	public User getVoter() {
		return voter;
	}
	/**
	 * @param voter the voter to set
	 */
	public void setVoter(User voter) {
		this.voter = voter;
	}
	
}

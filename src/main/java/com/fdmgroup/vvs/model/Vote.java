package com.fdmgroup.vvs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private int voteId;
	@OneToOne
	@JoinColumn(referencedColumnName = "candidateId")
	private Candidate candidate;
	private Date date;
	@OneToOne
	@JoinColumn(referencedColumnName = "userId")
	private User voter;
	@ManyToOne
	@JoinColumn(referencedColumnName = "pollId")
	private Poll poll;
	
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vote(int voteId, Candidate candidate, Date date, User voter, Poll poll) {
		super();
		this.voteId = voteId;
		this.candidate = candidate;
		this.date = date;
		this.voter = voter;
		this.poll = poll;
	}
	public Vote(int voteId, Candidate candidate, User voter, Poll poll) {
		super();
		this.voteId = voteId;
		this.candidate = candidate;
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
		return "Vote [voteId=" + voteId + ", candidate=" + candidate + ", date=" + date + ", voter=" + voter + "]";
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
	public Candidate getCandidate() {
		return candidate;
	}
	/**
	 * @param candidate the candidate to set
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
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

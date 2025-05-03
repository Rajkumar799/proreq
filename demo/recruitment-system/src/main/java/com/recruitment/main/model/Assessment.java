package com.recruitment.main.model;

import jakarta.persistence.*;

@Entity
@Table(name = "assessments")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comments;

    @Enumerated(EnumType.STRING)
    private AssessmentResult result; // SELECTED / NOT_SELECTED

    @OneToOne
    @JoinColumn(name = "interview_id")
    private Interview interview;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public AssessmentResult getResult() {
		return result;
	}

	public void setResult(AssessmentResult result) {
		this.result = result;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

    // Getters and Setters
    
}
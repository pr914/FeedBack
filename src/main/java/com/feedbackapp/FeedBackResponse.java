package com.feedbackapp;

public class FeedBackResponse {

    private Long id;
    private String feedback_response;
    
    public FeedBackResponse() {
    }
    public FeedBackResponse(Long id, String feedback_response) {
        this.id = id;
        this.feedback_response = feedback_response;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFeedback_response() {
        return feedback_response;
    }
    public void setFeedback_response(String feedback_response) {
        this.feedback_response = feedback_response;
    }
    


    
}

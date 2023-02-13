package com.feedbackapp;

public class FeedBack {


    

    private String happy_At_Work;
    private String coming_To_Work_Every_Day;
    private String challenge_At_Work;
    private String comfort_at_Work;
    private String like_most_about_working;
    
    public FeedBack() {
    }
    public FeedBack(String happy_At_Work, String coming_To_Work_Every_Day, String challenge_At_Work,
            String comfort_at_Work, String like_most_about_working) {
        
        this.happy_At_Work = happy_At_Work;
        this.coming_To_Work_Every_Day = coming_To_Work_Every_Day;
        this.challenge_At_Work = challenge_At_Work;
        this.comfort_at_Work = comfort_at_Work;
        this.like_most_about_working = like_most_about_working;
    }
    
    public String getHappy_At_Work() {
        return happy_At_Work;
    }
    public void setHappy_At_Work(String happy_At_Work) {
        this.happy_At_Work = happy_At_Work;
    }
    public String getComing_To_Work_Every_Day() {
        return coming_To_Work_Every_Day;
    }
    public void setComing_To_Work_Every_Day(String coming_To_Work_Every_Day) {
        this.coming_To_Work_Every_Day = coming_To_Work_Every_Day;
    }
    public String getChallenge_At_Work() {
        return challenge_At_Work;
    }
    public void setChallenge_At_Work(String challenge_At_Work) {
        this.challenge_At_Work = challenge_At_Work;
    }
    public String getComfort_at_Work() {
        return comfort_at_Work;
    }
    public void setComfort_at_Work(String comfort_at_Work) {
        this.comfort_at_Work = comfort_at_Work;
    }
    public String getLike_most_about_working() {
        return like_most_about_working;
    }
    public void setLike_most_about_working(String like_most_about_working) {
        this.like_most_about_working = like_most_about_working;
    }

     



    
}

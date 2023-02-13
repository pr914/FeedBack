package com.feedbackapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FeedBackService {
 public static int rating=0;
    public ResponseEntity<?> processFeedBack(FeedBack feedBack)
     {
        FeedBackResponse response=new FeedBackResponse();
        if(Integer.parseInt(feedBack.getHappy_At_Work())>=3)
        {
           rating=rating+ApplicationConstants.happy_At_Work_Above_3_and_3;
        }
        else{
            rating=rating+ApplicationConstants.happy_At_Work_below_3;
        }
        if(Integer.parseInt(feedBack.getChallenge_At_Work())>=8)
        {
            rating=rating+ApplicationConstants.challenge_At_Work_above_8;
        }
        else if(Integer.parseInt(feedBack.getChallenge_At_Work())>=5 && Integer.parseInt(feedBack.getChallenge_At_Work())<8)
        {
            rating=rating+ApplicationConstants.challenge_At_Work_5_8;
        }
        else{
            rating=rating+ApplicationConstants.challenge_At_Work_1_3;
        }
        if(feedBack.getComing_To_Work_Every_Day().trim().toUpperCase().equalsIgnoreCase("YES"))
        {
            rating=rating+ApplicationConstants.coming_To_Work_Every_Day_YES;
        }
        else{
            rating=rating+ApplicationConstants.coming_To_Work_Every_Day_NO;
        }
        if(feedBack.getComfort_at_Work().trim().toUpperCase().equalsIgnoreCase("YES"))
        {
            rating=rating+ApplicationConstants.comfort_At_Work_YES;
        }
        else{
            rating=rating+ApplicationConstants.comfort_At_Work_NO;
        }

        /*
         * now validate the Rating and giving back the response based the rating got by the ansers
         */

         if(rating==ApplicationConstants.VERY_SAD) 
         {
             response.setFeedback_response("You seems to be Very Sad with the Work");
         }
         else if(rating==ApplicationConstants.LIKELY_HAPPY)
         {
            response.setFeedback_response("You seems to be likely happy with the Work");
         }
         else if(rating==ApplicationConstants.SAD)
         {
            response.setFeedback_response("you seems to be some what unsatisfy with the work");
         }
         else if(rating==ApplicationConstants.SATISFIED)
         {
            response.setFeedback_response("you are satisfied with the work");
         }
         else 
         {
            if(rating==ApplicationConstants.VERY_HAPPY)
            {
                response.setFeedback_response("you are very happy with work");
            }
            else{
                response.setFeedback_response("You are unahappy with the work");
            }
         }
         rating=0;
         return new ResponseEntity<String>(response.getFeedback_response(), HttpStatus.OK);
     }
    
}

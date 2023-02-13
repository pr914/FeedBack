package com.feedbackapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins ="*")
public  class FeedBackController{

   @Autowired
   FeedBackService feedbackService;

    @PostMapping(value=ApplicationConstants.SERVICE_URI)
    public ResponseEntity<?> processAndBroadCasrFeedBack(@RequestBody FeedBackDTO feedBack)
    {
         FeedBack feed=new FeedBack();
         if(feedBack.getQuestion1()==null)
         {
            feed.setHappy_At_Work("0");
         }
         feed.setHappy_At_Work(feedBack.getQuestion1());
         if(feedBack.getQuestion3()==null)
         {
            feed.setChallenge_At_Work("0");
         }
         if(feedBack.getQuestion2()==null)
         {
            feed.setComfort_at_Work("No");
         }
         feed.setChallenge_At_Work(feedBack.getQuestion3());
         feed.setComfort_at_Work(feedBack.getQuestion2());
         if(feedBack.getQuestion4()==null)
         {
            feed.setComing_To_Work_Every_Day("No"); 
         }
         feed.setComing_To_Work_Every_Day(feedBack.getQuestion4());
         feed.setLike_most_about_working(feedBack.getQuestion5());
       return feedbackService.processFeedBack(feed);
    }
    @GetMapping(value="getdata")
    public ResponseEntity<?> getMethodName() {
        FeedBackDTO dt=new FeedBackDTO();
        
        return new ResponseEntity<FeedBackDTO>(dt,HttpStatus.OK);
    }
    


    

}
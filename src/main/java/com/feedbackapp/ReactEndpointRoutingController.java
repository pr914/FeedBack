package com.feedbackapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactEndpointRoutingController {

    @GetMapping(value="/feedback")
    public String routeToFeedBackForm()
    {
       return "forward:/";
    }
    
}

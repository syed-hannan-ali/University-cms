package com.example.UniversityCMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {

        return "index"; // loads templates/index.html
    }

    @GetMapping("/index.html")
    public String index() {

        return "index"; // loads templates/index.html
    }

    @GetMapping("/attendance.html")
    public String attendance() {
        return "attendance";
    }

    @GetMapping("/marks.html")
    public String marks() {
        return "marks";
    }

    @GetMapping("/transcript.html")
    public String transcript() {
        return "transcript";
    }

    @GetMapping("/challans.html")
    public String challans() {
        return "challans";
    }

    @GetMapping("/feedback.html")
    public String feedback() {
        return "feedback";
    }

    @GetMapping("/signin-up.html")
    public String signInUp() {
        return "signin-up";
    }
}
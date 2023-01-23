package com.example.national_football_team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/national_teams")
    public String index()
    {
        return "index";
    }
}

package com.zeek.zeekresume.data;

import com.zeek.zeekresume.model.Project;

import java.util.ArrayList;
import java.util.List;

public class SampleProjects {
    public static List<Project> getSampleProjects(){
        List<Project> projects = new ArrayList<>();
        Project p1 = new Project();
        p1.setProjectName("ZeeK Hangman");
        p1.setImagePath("https://botlist.co/system/BotList/Bot/logos/000/003/073/medium/submission1766S54791.png");
        p1.setDescription("Facebook chat bot");
        p1.setLandingPage("http:/google.com");
        p1.setType("Chat Bot");
        projects.add(p1);
        Project p2 = new Project();
        p1.setProjectName("ZeeK Monitor");
        p1.setImagePath("https://botlist.co/system/BotList/Bot/logos/000/003/073/medium/submission1766S54791.png");
        p1.setDescription("Monitoring Tool");
        p1.setLandingPage("http:/google.com");
        p1.setType("Performance");
        projects.add(p2);
        return projects;
    }
}

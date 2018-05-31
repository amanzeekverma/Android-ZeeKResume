package com.zeek.zeekresume.data;

import com.zeek.zeekresume.model.School;

import java.util.ArrayList;
import java.util.List;

public class SampleSchool {
    public static List<School> getSampleProjects(){
        List<School> schools = new ArrayList<>();
        School s1 = new School();
        s1.setSchoolName("SASTRA");
        s1.setGraduationYear("2008");
        s1.setDegreeName("B-Tech, Computer Sc. & Engg");
        s1.setImageLink("https://upload.wikimedia.org/wikipedia/commons/9/99/TATA_Consultancy_Services_Logo_blue.svg");
        schools.add(s1);
        return schools;
    }
}

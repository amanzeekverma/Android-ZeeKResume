package com.zeek.zeekresume.data;

import com.zeek.zeekresume.model.Company;

import java.util.ArrayList;
import java.util.List;

public class SampleCompanies {
    public static List<Company> getSampleCompanies(){
        List<Company> companies = new ArrayList<>();
        Company company1 = new Company();
        company1.setCompanyName("Tata Consultancy Services");
        company1.setLogo("https://upload.wikimedia.org/wikipedia/commons/9/99/TATA_Consultancy_Services_Logo_blue.svg");
        company1.setCity("Gurgaon");
        company1.setCountry("India");
        company1.setJobDescSummary("Performance Engineer");
        company1.setPeriod("2008-2010");
        company1.setState("Haryana");
        company1.setPosition("Systems Engineer");
        companies.add(company1);

        Company company2 = new Company();
        company2.setCompanyName("Tata Consultancy Services");
        company2.setLogo("https://upload.wikimedia.org/wikipedia/commons/9/99/TATA_Consultancy_Services_Logo_blue.svg");
        company2.setCity("Woonsocket");
        company2.setCountry("USA");
        company2.setJobDescSummary("Performance Engineer");
        company2.setPeriod("2010-2012");
        company2.setState("Rhode Island");
        company2.setPosition("Systems Engineer");
        companies.add(company2);


        return companies;
    }

}

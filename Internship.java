package com.example.demo;

public class Internship {
     private String company;
    private String role;
    private String skill;

    public Internship(String company, String role, String skill) {
        this.company = company;
        this.role = role;
        this.skill = skill;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public String getSkill() {
        return skill;
    }
}

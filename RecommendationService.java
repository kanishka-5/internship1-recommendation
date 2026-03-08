package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Internship;
import com.example.demo.Student;

@Service
public class RecommendationService {

    public List<Internship> recommend(Student student) {

        List<Internship> internships = new ArrayList<>();

        internships.add(new Internship("TCS", "Java Developer Intern", "Java"));
        internships.add(new Internship("Infosys", "Web Developer Intern", "HTML"));
        internships.add(new Internship("Wipro", "Python Developer Intern", "Python"));

        List<Internship> result = new ArrayList<>();

        for (Internship i : internships) {

            if (student.getSkills().toLowerCase()
                    .contains(i.getSkill().toLowerCase())) {

                result.add(i);
            }
        }

        return result;
    }
}


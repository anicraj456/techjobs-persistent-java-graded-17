package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    // Models --task 2
    @NotBlank(message = "Location is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String location;

    //Add a jobs Field to Employer -- one to many-- task 5/1-2
    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();


    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getName();
    }

    public List<Job> getJobs() {
        return jobs;
    }
}

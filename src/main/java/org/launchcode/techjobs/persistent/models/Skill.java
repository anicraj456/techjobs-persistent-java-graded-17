package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description too long!")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> job = new ArrayList<>();

    public Skill(String description) {
        super();
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public List<Job> getJob() {
        return job;
    }

    public void setJob(List<Job> job) {
        this.job = job;
    }

}

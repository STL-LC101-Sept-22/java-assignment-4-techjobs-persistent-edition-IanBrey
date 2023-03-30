package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    public Skill () {}

    public Skill (String description, List<Job> jobs) {
        this.jobs = jobs;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
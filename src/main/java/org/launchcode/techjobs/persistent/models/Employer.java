package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @Size(max = 80)
    @NotNull
    public String location;

    @OneToMany(mappedBy = "employer")
//    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public List<Job> getJobs() { return jobs; }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

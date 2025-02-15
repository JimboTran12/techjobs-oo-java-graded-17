package org.launchcode.techjobs.oo;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {
        String aName;
        String aLocation;
        String aCoreCompetency;
        String aPositionType;
        String aEmployer;
        String out = "";
        if (this.name == null || name.isEmpty()) {
            aName = "Data not available";
        }
        else {
            aName = name;
        }
        if (this.location == null || location.getValue().isEmpty()) {
            aLocation = "Data not available";
        }
        else {
            aLocation = location.getValue();
        }
        if (this.employer == null || employer.getValue().isEmpty()) {
            aEmployer = "Data not available";
        }
        else {
            aEmployer = employer.getValue();
        }
        if (this.positionType == null || positionType.getValue().isEmpty()) {
            aPositionType = "Data not available";
        }
        else {
            aPositionType = positionType.getValue();
        }
        if (this.coreCompetency == null || coreCompetency.getValue().isEmpty()) {
            aCoreCompetency = "Data not available";
        }
        else {
            aCoreCompetency = coreCompetency.getValue();
        }


        out += String.format(System.lineSeparator() + "ID: %s\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s" + System.lineSeparator(), id, aName, aEmployer, aLocation, aPositionType, aCoreCompetency);
            return out;


    }


}

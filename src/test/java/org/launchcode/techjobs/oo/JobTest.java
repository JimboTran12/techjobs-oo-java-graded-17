package org.launchcode.techjobs.oo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.testng.Assert.*;
public class JobTest {
    Job blankJob1 = new Job();
    Job blankJob2 = new Job();
    Job job= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    //TODO: Create your unit tests here



   @Test
    public void testSettingJobId() {
        assertNotEquals(blankJob1.getId(),blankJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job.getName() instanceof String);
        assertEquals(job.getName(), "Product tester");
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals(job.getEmployer().getValue(), "ACME");
        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getLocation().getValue(), "Desert");
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getPositionType().getValue(), "Quality control");
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        assertTrue(job.toString().startsWith(System.lineSeparator()));
        assertTrue(job.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        assertEquals(job.toString(), "\nID: " + job.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        assertEquals(blankJob1.toString(),"\nID: " + blankJob1.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n");
    }



}

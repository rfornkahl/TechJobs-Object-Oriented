package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob = new Job();
    Job testJob2 = new Job();
    Job testFullJobObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testFullJobObjectDup = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testFullJobObjectEmptyField = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());

    @Test
    public void testSettingJobId(){
        Job testJob = new Job();
        Job testJob2 = new Job();
        Assert.assertFalse(testJob.getId() == testJob2.getId());
        Assert.assertFalse(testJob.getId() == testJob2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job testFullJobObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue((testFullJobObject.getName() instanceof  String));
        Assert.assertTrue(testFullJobObject.getEmployer() instanceof Employer);
        Assert.assertTrue(testFullJobObject.getLocation() instanceof Location);
        Assert.assertTrue(testFullJobObject.getPositionType() instanceof PositionType);
        Assert.assertTrue(testFullJobObject.getCoreCompetency() instanceof CoreCompetency);
         Assert.assertEquals(testFullJobObject.getName(), "Product tester");
         Assert.assertEquals("ACME", testFullJobObject.getEmployer().value);
        Assert.assertEquals("Desert", testFullJobObject.getLocation().value);
        Assert.assertEquals("Quality control", testFullJobObject.getPositionType().value);
        Assert.assertEquals("Persistence", testFullJobObject.getCoreCompetency().value);


    }

    @Test
    public void testJobsForEquality(){

        Assert.assertFalse(testFullJobObject == testFullJobObjectDup );
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals('\n', testFullJobObject.toString().charAt(0));
        assertEquals('\n',testFullJobObject.toString().charAt(testFullJobObject.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData (){
        assertEquals("\nID: " + testFullJobObject.getId() + "\nName: " + testFullJobObject.getName()
                + "\nEmployer: " + testFullJobObject.getEmployer() + "\nLocation: " + testFullJobObject.getLocation()
                + "\nPosition Type: " + testFullJobObject.getPositionType() + "\nCore Competency: " + testFullJobObject.getCoreCompetency() + "\n", testFullJobObject.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        assertEquals("\nID: " + testFullJobObjectEmptyField.getId() + "\nName: Data not available"
                + "\nEmployer: Data not available" + "\nLocation: Data not available"
                + "\nPosition Type: Data not available" + "\nCore Competency: Data not available" + "\n", testFullJobObjectEmptyField.toString());
    }
}


package org.launchcode.techjobs.oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class JobTest {

    Job testJob = new Job();
    Job testJob2 = new Job();
    Job testFullJobObject = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testFullJobObjectDup = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testFullJobObjectEmptyField = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());

    @Test
    public void testSettingJobId(){
        assertFalse(testJob.getId() == testJob2.getId());
    }

    @Test
    public void testSettingId(){
        assertFalse(testJob.getId() == testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue((testFullJobObject.getName() instanceof  String));
       assertTrue(testFullJobObject.getEmployer() instanceof Employer);
        assertTrue(testFullJobObject.getLocation() instanceof Location);
        assertTrue(testFullJobObject.getPositionType() instanceof PositionType);
      assertTrue(testFullJobObject.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
       assertFalse(testFullJobObject == testFullJobObjectDup );
    }

    @Test
    public void toStringBlankLineBeforeAndAfterJobInformation(){
       assertEquals('\n',testFullJobObject.toString().charAt(0));
        assertEquals('\n',testFullJobObject.toString().charAt(testFullJobObject.toString().length()-1));
    }

    @Test
    public void toStringEachFieldOnItsOwnLineWithColonSpaceThenItem(){
      assertEquals("\nID: " + testFullJobObject.getId() + "\nName: " + testFullJobObject.getName()
              + "\nEmployer: " + testFullJobObject.getEmployer() + "\nLocation: " + testFullJobObject.getLocation()
              + "\nPosition Type: " + testFullJobObject.getPositionType() + "\nCore Competency: " + testFullJobObject.getCoreCompetency() + "\n", testFullJobObject.toString());
      }

      @Test
    public void fieldIsEmptyDataNotAvailable(){
          assertEquals("\nID: " + testFullJobObjectEmptyField.getId() + "\nName: Data not available"
                  + "\nEmployer: Data not available" + "\nLocation: Data not available"
                  + "\nPosition Type: Data not available" + "\nCore Competency: Data not available" + "\n", testFullJobObjectEmptyField.toString());
      }
      }


import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Carl", "LP3240555", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("Carl", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("LP3240555", developer.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100000, developer.getSalary());
    }

    @Test
    public void canGiveRaise(){
        developer.raiseSalary(2000.00);
        assertEquals(102000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, developer.payBonus(), 0.01);
    }

}

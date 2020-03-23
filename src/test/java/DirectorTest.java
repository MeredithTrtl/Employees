import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Lenny", "KDJ49023", 40000, "Everything", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Lenny", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("KDJ49023", director.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Everything", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canGiveRaise(){
        director.raiseSalary(2000.00);
        assertEquals(42000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, director.payBonus(), 0.01);
    }

}

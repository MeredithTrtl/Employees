import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Barry", "GF5930000", 30000, "Client Relations");
    }

    @Test
    public void canGetName(){
        assertEquals("Barry", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("GF5930000", manager.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Client Relations", manager.getDeptName());
    }

    @Test
    public void canGiveRaise(){
        manager.raiseSalary(2000.00);
        assertEquals(32000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.01);
    }

}

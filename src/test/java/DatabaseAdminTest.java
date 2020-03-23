import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Edwina", "3049872HJ", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("Edwina", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("3049872HJ", databaseAdmin.getNationalInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void canGiveRaise(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.01);
    }

}

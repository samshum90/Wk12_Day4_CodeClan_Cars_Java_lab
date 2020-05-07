import Dealership.Dealership;
import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;

    @Before
    public void before(){
        dealership = new Dealership( 20000000 );
    }

    @Test
    public void getTill(){
        assertEquals( 20000000, dealership.getTill());
    }

}

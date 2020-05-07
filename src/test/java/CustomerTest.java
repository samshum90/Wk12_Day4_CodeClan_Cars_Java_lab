import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void before(){
        customer = new Customer( 20000 );
    }


    @Test
    public void getWallet(){
        assertEquals( 20000, customer.getWallet());
    }

}

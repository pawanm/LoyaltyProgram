import junit.framework.Assert;
import mettl.sales.offers.loyalty.contracts.ICustomer;
import mettl.sales.offers.loyalty.contracts.ICustomerStore;
import mettl.sales.offers.loyalty.store.CustomerStore;
import mettl.sales.offers.loyalty.types.CustomerClass;
import org.junit.Test;

import java.util.List;

public class CustomerStoreTest {

    private static final long TEST_LOYALTY_CARD_NO = 10l;

    @Test
    public void shouldGiveAnEmptyCustomerListOnInitialization () {
        ICustomerStore store = new CustomerStore();
        List<ICustomer> customerList = store.getCustomersList();
        Assert.assertEquals(0, customerList.size());
    }


    @Test
    public void mustCreateNewCustomerOnFirstRequest () {
        ICustomerStore store = new CustomerStore();
        ICustomer customer = store.getOrCreateCustomer(TEST_LOYALTY_CARD_NO);

        Assert.assertNotNull(customer);
        Assert.assertEquals(TEST_LOYALTY_CARD_NO, customer.getLoyaltyCardNo());
        Assert.assertEquals(CustomerClass.NORMAL, customer.getCustomerClass());
        Assert.assertEquals(0, customer.getLoyaltyPoints());

        Assert.assertEquals(1, store.getCustomersList().size());
    }


    @Test
    public void mustBeAbleToRetrievePreviouslyCreatedCustomer () {
        ICustomerStore store = new CustomerStore();
        ICustomer customer = store.getOrCreateCustomer(TEST_LOYALTY_CARD_NO);

        ICustomer anotherInstanceOfCustomre = store.getOrCreateCustomer(TEST_LOYALTY_CARD_NO);

        Assert.assertEquals(customer, anotherInstanceOfCustomre);
    }


    @Test
    public void createTrouble ()
    {
        ICustomerStore store = new CustomerStore() ;
        ICustomer customer = store.getOrCreateCustomer(TEST_LOYALTY_CARD_NO);

        // this can create potential trouble
        store.getCustomersList().add(customer);

        Assert.assertEquals(1, store.getCustomersList());
    }

}

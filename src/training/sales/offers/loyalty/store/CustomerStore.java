package training.sales.offers.loyalty.store;

import training.sales.offers.loyalty.contracts.ICustomer;
import training.sales.offers.loyalty.contracts.ICustomerStore;
import training.sales.offers.loyalty.entities.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerStore implements ICustomerStore
{
    List<ICustomer> mCustomerList;

    public CustomerStore()
    {
        mCustomerList = new ArrayList<ICustomer>();
    }

    public ICustomer getOrCreateCustomer(long loyaltyNo)
    {
        for(ICustomer c: mCustomerList)
        {
            if(c.getLoyaltyCardNo()==loyaltyNo)
            {
                return c;
            }
        }

        return registerCustomer(loyaltyNo);
    }

    public List<ICustomer> getCustomersList()
    {
        return Collections.unmodifiableList(mCustomerList);
    }

    private ICustomer registerCustomer(long loyaltyNo)
    {
        ICustomer customer = new Customer(loyaltyNo);
        mCustomerList.add(customer);
        return customer;
    }
}

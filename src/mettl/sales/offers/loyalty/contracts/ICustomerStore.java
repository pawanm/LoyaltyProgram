package mettl.sales.offers.loyalty.contracts;

import java.util.List;

public interface ICustomerStore
{
    public ICustomer getOrCreateCustomer(long loyaltyNo);
    public List<ICustomer> getCustomersList();
}

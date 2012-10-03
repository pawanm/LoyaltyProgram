package mettl.sales.offers.loyalty.factories;

import mettl.sales.offers.loyalty.contracts.ICustomerStore;
import mettl.sales.offers.loyalty.contracts.IStoreFactory;
import mettl.sales.offers.loyalty.contracts.ITransactionStore;
import mettl.sales.offers.loyalty.store.CustomerStore;
import mettl.sales.offers.loyalty.store.TransactionStore;

public class MockedStoreFactory implements IStoreFactory
{
    private ITransactionStore mTransactionStore;
    private ICustomerStore mCustomerStore;

    public MockedStoreFactory()
    {
       mTransactionStore = new TransactionStore();
       mCustomerStore = new CustomerStore();
    }


    public ITransactionStore getTransactionStore()
    {
       return mTransactionStore;
    }

    public ICustomerStore getCustomerStore()
    {
        return mCustomerStore;
    }
}

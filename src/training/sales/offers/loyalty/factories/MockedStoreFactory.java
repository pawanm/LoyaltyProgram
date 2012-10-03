package training.sales.offers.loyalty.factories;

import training.sales.offers.loyalty.contracts.ICustomerStore;
import training.sales.offers.loyalty.contracts.IStoreFactory;
import training.sales.offers.loyalty.contracts.ITransactionStore;
import training.sales.offers.loyalty.store.CustomerStore;
import training.sales.offers.loyalty.store.TransactionStore;

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

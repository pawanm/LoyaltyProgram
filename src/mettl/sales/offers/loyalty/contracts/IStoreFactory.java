package mettl.sales.offers.loyalty.contracts;

public interface IStoreFactory
{
    public ITransactionStore getTransactionStore();
    public ICustomerStore getCustomerStore();
}

package mettl.sales.offers.loyalty.contracts;

import mettl.sales.offers.loyalty.types.CustomerClass;

import java.util.List;

public interface ICustomer
{
    public long getLoyaltyCardNo();

    public String getName();

    public String getEmail();

    public long getLoyaltyPoints();

    public List<IPurchaseTransactionEntry> getTransactionEntries();

    public CustomerClass getCustomerClass();

    public void setName(String value);

    public void setEmail(String value);

    public void addTransaction(IPurchaseTransactionEntry entry);


}

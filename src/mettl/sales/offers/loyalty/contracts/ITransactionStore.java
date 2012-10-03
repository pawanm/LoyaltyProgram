package mettl.sales.offers.loyalty.contracts;

import java.util.List;

public interface ITransactionStore
{
    public List<IPurchaseTransactionEntry> getTransactionEntries();
}

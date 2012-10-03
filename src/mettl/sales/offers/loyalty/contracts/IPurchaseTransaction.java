package mettl.sales.offers.loyalty.contracts;

import java.util.Date;

public interface IPurchaseTransaction
{
    public double getPurchaseAmount();
    public Date getPurchaseDate();
    public long getPurchaseTransactionId();
}

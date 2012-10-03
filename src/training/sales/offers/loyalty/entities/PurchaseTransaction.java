package training.sales.offers.loyalty.entities;

import training.sales.offers.loyalty.contracts.IPurchaseTransaction;
import training.sales.offers.loyalty.utils.RandomUtils;

import java.util.Date;

public class PurchaseTransaction implements IPurchaseTransaction
{
    private double mPurchaseAmount;
    private Date mPurchaseDate;
    private long mPurchaseTransactionId;

    public PurchaseTransaction(Date purchaseDate, double purchaseAmount)
    {
        mPurchaseTransactionId = RandomUtils.getUniquePurchaseId();
        mPurchaseDate=purchaseDate;
        mPurchaseAmount=purchaseAmount;
    }

    public double getPurchaseAmount()
    {
        return mPurchaseAmount;
    }

    public Date getPurchaseDate()
    {
        return mPurchaseDate;
    }

    public long getPurchaseTransactionId()
    {
        return mPurchaseTransactionId;
    }
}

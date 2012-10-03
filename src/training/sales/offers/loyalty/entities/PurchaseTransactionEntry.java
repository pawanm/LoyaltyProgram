package training.sales.offers.loyalty.entities;


import training.sales.offers.loyalty.contracts.IPurchaseTransaction;
import training.sales.offers.loyalty.contracts.IPurchaseTransactionEntry;

import java.util.Date;

public class PurchaseTransactionEntry implements IPurchaseTransactionEntry
{
    private long mPurchaseTransactionId;
    private double mPurchaseAmount;
    private Date mPurchaseDate;
    private String mName;
    private String mEmail;
    private long mLoyaltyNo;
    private long mLoyaltyPoints;

    public PurchaseTransactionEntry(IPurchaseTransaction transaction)
    {
        mPurchaseTransactionId=transaction.getPurchaseTransactionId();
        mPurchaseAmount=transaction.getPurchaseAmount();
        mPurchaseDate=transaction.getPurchaseDate();
    }

    public void setName(String mName)
    {
        this.mName = mName;
    }

    public void setEmail(String mEmail)
    {
        this.mEmail = mEmail;
    }

    public void setLoyaltyCardNo(long mLoyaltyCardNo)
    {
        this.mLoyaltyNo = mLoyaltyCardNo;
    }

    public void setPoints(long value)
    {
        mLoyaltyPoints =value;
    }

    public long getPurchaseTransactionId()
    {
        return mPurchaseTransactionId;
    }

    public double getPurchaseAmount()
    {
        return mPurchaseAmount;
    }

    public Date getPurchaseDate()
    {
        return mPurchaseDate;
    }

    public String getName()
    {
        return mName;
    }

    public String getEmail()
    {
        return mEmail;
    }

    public long getLoyaltyNo()
    {
        return mLoyaltyNo;
    }

    public long getLoyaltyPoints()
    {
        return mLoyaltyPoints;
    }
}

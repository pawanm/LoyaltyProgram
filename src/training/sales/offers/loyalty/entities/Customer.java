package training.sales.offers.loyalty.entities;

import training.sales.offers.loyalty.contracts.ICustomer;
import training.sales.offers.loyalty.contracts.IPurchaseTransactionEntry;
import training.sales.offers.loyalty.types.CustomerClass;
import training.sales.offers.loyalty.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer
{
    private long mId;
    private String mName;
    private String mEmail;
    private long mLoyaltyCardNo;
    private CustomerClass mClass;
    private List<IPurchaseTransactionEntry> mPurchaseTransactionEntries;
    private double mTotalPurchaseAmount;
    private long mLoyaltyPoints;

    public Customer(long loyaltyNo)
    {
       mId= RandomUtils.getUniqueCustomerId();
        mLoyaltyCardNo=loyaltyNo;
        mPurchaseTransactionEntries = new ArrayList<IPurchaseTransactionEntry>();
       mTotalPurchaseAmount=0;
        mLoyaltyPoints=0;
        mClass=CustomerClass.NORMAL;
    }

    public String getName()
    {
        return mName;
    }

    public String getEmail()
    {
        return mEmail;
    }

    public long getLoyaltyPoints()
    {
        return mLoyaltyPoints;
    }

    public long getLoyaltyCardNo()
    {
        return mLoyaltyCardNo;
    }

    public CustomerClass getCustomerClass()
    {
        return mClass;
    }

    public List<IPurchaseTransactionEntry> getTransactionEntries()
    {
        return mPurchaseTransactionEntries;
    }

    public void setName(String value)
    {
        if(!(value==null || value.equals("")))
        {
            mName=value;
        }
    }

    public void setEmail(String value)
    {
        if(!(value==null || value.equals("")))
        {
            mEmail=value;
        }
    }

    public void addTransaction(IPurchaseTransactionEntry entry)
    {
        mPurchaseTransactionEntries.add(entry);
        mTotalPurchaseAmount +=  entry.getPurchaseAmount();
        mLoyaltyPoints += entry.getLoyaltyPoints();
        updateCustomerClass();
    }

    private void updateCustomerClass()
    {
       if (mTotalPurchaseAmount>50000)
       {
           mClass=CustomerClass.GOLD;
       }
       else if(mTotalPurchaseAmount>25000)
       {
           mClass=CustomerClass.SILVER;
       }
    }


}

package training.sales.offers.loyalty.store;

import training.sales.offers.loyalty.contracts.IPurchaseTransaction;
import training.sales.offers.loyalty.contracts.IPurchaseTransactionEntry;
import training.sales.offers.loyalty.contracts.ITransactionStore;
import training.sales.offers.loyalty.entities.PurchaseTransaction;
import training.sales.offers.loyalty.entities.PurchaseTransactionEntry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionStore implements ITransactionStore
{
    List<IPurchaseTransactionEntry> mPurchaseTransactionEntries;

    public TransactionStore()
    {
        mPurchaseTransactionEntries = new ArrayList<IPurchaseTransactionEntry>();
    }

    public List<IPurchaseTransactionEntry> getTransactionEntries()
    {
        mPurchaseTransactionEntries.add(getTransactionEntry(1101,"KetanKapoor","mail@ketankapoor.com",15000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1102,"Abhay","",5000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1102,"Abhay","",7000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1101,"Ketan","",11000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1103,"Ashish","",17000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1103,"Ashish","ashish@gmail.com",18000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1101,"","",26000));
        mPurchaseTransactionEntries.add(getTransactionEntry(1101,"","",1000));
        mPurchaseTransactionEntries.add(getTransactionEntry("","",1000));
        return mPurchaseTransactionEntries;
    }

    private IPurchaseTransactionEntry getTransactionEntry(long loyaltyNo, String name, String email, double purchaseAmt)
    {
        IPurchaseTransaction purchaseTransaction = new PurchaseTransaction(new Date(),purchaseAmt);
        IPurchaseTransactionEntry entry =new PurchaseTransactionEntry(purchaseTransaction);
        entry.setLoyaltyCardNo(loyaltyNo);
        entry.setName(name);
        entry.setEmail(email);
        return entry;
    }

    private IPurchaseTransactionEntry getTransactionEntry(String name, String email, double purchaseAmt)
    {
        return getTransactionEntry(0,name,email,purchaseAmt);
    }


}

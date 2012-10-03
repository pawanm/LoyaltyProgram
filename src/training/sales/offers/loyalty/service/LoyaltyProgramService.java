package training.sales.offers.loyalty.service;

import training.sales.offers.loyalty.contracts.ICustomer;
import training.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;
import training.sales.offers.loyalty.contracts.IPurchaseTransactionEntry;
import training.sales.offers.loyalty.contracts.IStoreFactory;
import training.sales.offers.loyalty.factories.LoyaltyStrategyFactory;

import java.util.Date;

public class LoyaltyProgramService
{
    IStoreFactory mStoreFactory;
    private final Date currentFYDate = new Date(1,1,2012);

    public LoyaltyProgramService(IStoreFactory storeFactory)
    {
        mStoreFactory = storeFactory;
    }

    public void processPurchaseTransactions()
    {
        for (IPurchaseTransactionEntry entry : mStoreFactory.getTransactionStore().getTransactionEntries())
        {
            if (entry.getLoyaltyNo() != 0 && entry.getPurchaseDate().after(currentFYDate))
            {
                process(entry);
            }
        }
    }

    private void process(IPurchaseTransactionEntry purchaseTransactionEntry)
    {
        ICustomer customer = mStoreFactory.getCustomerStore().getOrCreateCustomer(purchaseTransactionEntry.getLoyaltyNo()); //will return either existing customer or create new one if not exists

        ILoyaltyProgramStrategy strategy = LoyaltyStrategyFactory.getStrategy(customer.getCustomerClass()); //retrieving strategy from factory based on customer's current class

        long loyaltyPoints = strategy.getLoyaltyPoints(purchaseTransactionEntry.getPurchaseAmount());

        purchaseTransactionEntry.setPoints(loyaltyPoints); //updating points in purchase transaction entry

        //updating customer profile (only works if getName or getEmail will not return null or blank respectively)
        customer.setName(purchaseTransactionEntry.getName());
        customer.setEmail(purchaseTransactionEntry.getEmail());

        //adding purchase transaction in customers transaction list, this will also update customer's class if needed
        customer.addTransaction(purchaseTransactionEntry);
    }


}

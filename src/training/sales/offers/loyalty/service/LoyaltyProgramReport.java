package training.sales.offers.loyalty.service;

import training.sales.offers.loyalty.contracts.ICustomer;
import training.sales.offers.loyalty.contracts.IPurchaseTransactionEntry;
import training.sales.offers.loyalty.contracts.IStoreFactory;

public class LoyaltyProgramReport
{

    private IStoreFactory mStoreFactory;

    public LoyaltyProgramReport(IStoreFactory storeFactory)
    {
        mStoreFactory = storeFactory;
    }

    public void displayLoyaltyPointsData()
    {
        for(ICustomer customer: mStoreFactory.getCustomerStore().getCustomersList())
        {
            displayCustomerRecord(customer);
        }
    }

    private void displayCustomerRecord(ICustomer customer)
    {
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("LoyaltyPoints: " + customer.getLoyaltyPoints());
        System.out.println("Class: " + customer.getCustomerClass().toString());
        System.out.println("\nTransactions");
        System.out.println("PurchaseAmount, PointsEarned");
        for(IPurchaseTransactionEntry entry: customer.getTransactionEntries())
        {
            System.out.print(entry.getPurchaseAmount() + ",");
            System.out.println(entry.getLoyaltyPoints());
        }
        System.out.println("\n");
    }
}

package mettl.sales.offers.loyalty.contracts;

public interface ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount);
}

package training.sales.offers.loyalty.contracts;

public interface ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount);
}

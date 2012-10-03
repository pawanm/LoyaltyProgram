package training.sales.offers.loyalty.schemes;

import training.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;

public class NormalLoyaltyProgram implements ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount)
    {
        long points = Math.round(transactionAmount/100);
        return points;
    }
}

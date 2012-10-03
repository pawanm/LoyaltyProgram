package mettl.sales.offers.loyalty.schemes;

import mettl.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;

public class NormalLoyaltyProgram implements ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount)
    {
        long points = Math.round(transactionAmount/100);
        return points;
    }
}

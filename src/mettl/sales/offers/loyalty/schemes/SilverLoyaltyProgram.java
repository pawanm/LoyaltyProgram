package mettl.sales.offers.loyalty.schemes;

import mettl.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;

public class SilverLoyaltyProgram implements ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount)
    {
        long divisor = Math.round(transactionAmount/100);
        long points = divisor*2;
        return points;
    }
}

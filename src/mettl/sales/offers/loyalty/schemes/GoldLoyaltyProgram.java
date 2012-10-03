package mettl.sales.offers.loyalty.schemes;

import mettl.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;

public class GoldLoyaltyProgram implements ILoyaltyProgramStrategy
{
    public long getLoyaltyPoints(double transactionAmount)
    {
        long divisor = Math.round(transactionAmount/500);
        long points = divisor*25;
        return points;
    }
}

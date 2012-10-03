package mettl.sales.offers.loyalty.factories;

import mettl.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;
import mettl.sales.offers.loyalty.schemes.GoldLoyaltyProgram;
import mettl.sales.offers.loyalty.schemes.NormalLoyaltyProgram;
import mettl.sales.offers.loyalty.schemes.SilverLoyaltyProgram;
import mettl.sales.offers.loyalty.types.CustomerClass;

public class LoyaltyStrategyFactory
{
    public static ILoyaltyProgramStrategy getStrategy(CustomerClass customerClass)
    {
        switch (customerClass)
        {
            case GOLD:
                return new GoldLoyaltyProgram();
            case SILVER:
                return new SilverLoyaltyProgram();
            default:
                return new NormalLoyaltyProgram();
        }
    }
}

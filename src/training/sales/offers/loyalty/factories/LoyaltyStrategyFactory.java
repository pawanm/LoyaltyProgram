package training.sales.offers.loyalty.factories;

import training.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;
import training.sales.offers.loyalty.schemes.GoldLoyaltyProgram;
import training.sales.offers.loyalty.schemes.NormalLoyaltyProgram;
import training.sales.offers.loyalty.schemes.SilverLoyaltyProgram;
import training.sales.offers.loyalty.types.CustomerClass;

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

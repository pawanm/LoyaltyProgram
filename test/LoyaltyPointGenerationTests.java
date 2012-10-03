import junit.framework.Assert;
import mettl.sales.offers.loyalty.contracts.ILoyaltyProgramStrategy;
import mettl.sales.offers.loyalty.schemes.GoldLoyaltyProgram;
import mettl.sales.offers.loyalty.schemes.NormalLoyaltyProgram;
import mettl.sales.offers.loyalty.schemes.SilverLoyaltyProgram;
import org.junit.Test;

public class LoyaltyPointGenerationTests
{
    @Test
    public void goldProgramPointsTest()
    {
        ILoyaltyProgramStrategy strategy = new GoldLoyaltyProgram();
        long value = strategy.getLoyaltyPoints(1000);
        Assert.assertEquals(value,50);
    }

    @Test
    public void silverProgramPointsTest()
    {
        ILoyaltyProgramStrategy strategy = new SilverLoyaltyProgram();
        long value = strategy.getLoyaltyPoints(1000);
        Assert.assertEquals(value,20);
    }

    @Test
    public void normalProgramPointsTest()
    {
        ILoyaltyProgramStrategy strategy = new NormalLoyaltyProgram();
        long value = strategy.getLoyaltyPoints(1000);
        Assert.assertEquals(value,10);
    }
}

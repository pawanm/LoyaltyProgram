package training.sales.offers.loyalty.utils;

import java.util.Random;

public class RandomUtils
{
    public static long getUniquePurchaseId()
    {
        Random random=new Random();
        return random.nextLong();
    }

    public static long getUniqueCustomerId()
    {
        Random random=new Random();
        return random.nextLong();
    }
}

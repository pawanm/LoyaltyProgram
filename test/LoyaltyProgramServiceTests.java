import mettl.sales.offers.loyalty.contracts.IStoreFactory;
import mettl.sales.offers.loyalty.factories.MockedStoreFactory;
import mettl.sales.offers.loyalty.service.LoyaltyProgramService;
import mettl.sales.offers.loyalty.service.LoyaltyProgramReport;
import org.junit.Before;
import org.junit.Test;

public class LoyaltyProgramServiceTests
{
    LoyaltyProgramService loyaltyProgramService;
    LoyaltyProgramReport loyaltyProgramReport;
    IStoreFactory mockedFactory;

    @Before
    public void init()
    {
        mockedFactory = new MockedStoreFactory();
        loyaltyProgramService = new LoyaltyProgramService(mockedFactory);
        loyaltyProgramReport = new LoyaltyProgramReport(mockedFactory);
    }

    @Test
    public void processPurchaseTransactionTest()
    {
        loyaltyProgramService.processPurchaseTransactions();
        loyaltyProgramReport.displayLoyaltyPointsData();
    }


}

package mettl.sales.offers.loyalty.contracts;

import java.util.Date;

public interface IPurchaseTransactionEntry
{
    public void setName(String mName);
    public void setEmail(String mEmail);
    public void setLoyaltyCardNo(long mLoyaltyCardNo);
    public void setPoints(long value);

    public long getPurchaseTransactionId();
    public double getPurchaseAmount();
    public Date getPurchaseDate();
    public String getName();
    public String getEmail();
    public long getLoyaltyNo();
    public long getLoyaltyPoints();

}

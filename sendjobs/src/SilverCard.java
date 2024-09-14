public class SilverCard extends MemberCard {
    public SilverCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        if (getPurchaseAmount()>= 1000) {
            return getPurchaseAmount() * .02d;
        }
        return 0;
    }

}

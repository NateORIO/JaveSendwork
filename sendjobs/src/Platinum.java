public class Platinum extends MemberCard {
    public Platinum (String name, double purchaseAmount) {
        super(name, purchaseAmount);
}

    @Override
    public double calculateDiscount() {
        if (getPurchaseAmount()>= 1000) {
            return getPurchaseAmount() * .05d;
        }
        return 0;
    }


}

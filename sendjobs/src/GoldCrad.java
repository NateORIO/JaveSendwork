public class GoldCrad extends MemberCard {
   public GoldCrad(String name, double purchaseAmount) {
    super(name, purchaseAmount);
   }

@Override
public double calculateDiscount() {
    if (getPurchaseAmount()>= 1000) {
        return getPurchaseAmount() * .03d;
    }
    return 0;
    }
}

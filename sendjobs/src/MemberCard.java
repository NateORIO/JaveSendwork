public class MemberCard {
    private String name;
    private double purchaseAmount;

    public MemberCard(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

     public double calculateDiscount() {
        return 0;
     }

     public void display() {
        System.out.println("Customer Name :"+name);
        System.out.println("Purchase Amount :"+purchaseAmount);
        System.out.println("Discount :"+calculateDiscount());
        System.out.println("Total Amount :"+(purchaseAmount - calculateDiscount()));
     }
}

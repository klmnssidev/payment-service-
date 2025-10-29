public class paymentMethod {
     private int amount;
     private String name;
     public paymentMethod(int amount, String name) {
        this.amount = amount;
        this.name = name;
        if (amount < 0) throw new IllegalArgumentException();
        else if (amount > 100) throw new IllegalArgumentException();
     }
     public int getAmount() {
         return amount;
     }
     public void setAmount(int amount) {
         this.amount = amount;
     }

     public String getName() {
         return name;
         // this return from feature branch
         //this also from feature-branch
     }

}

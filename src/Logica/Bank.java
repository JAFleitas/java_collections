package Logica;

public class Bank {
    private String countNumber;
    private String customerName;
    private double creditLimit;
    private String cartType;
    private double pendingDebt;

    public Bank() {
    }

    public Bank(String countNumber, String customerName, int creditLimit, String cartType, int pendingDebt) {
        this.countNumber = countNumber;
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.cartType = cartType;
        this.pendingDebt = pendingDebt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void increaseLimit (){
        boolean isDebtor = verifyDebtor();
       if(isDebtor){
           switch (cartType){
               case "Type 1":
                   creditLimit+= creditLimit * (0.25 * 0.5);
                   break;
               case "Type 2":
                   creditLimit+= creditLimit * (0.35 * 0.5);
                   break;
               default:
                   return;
           }
       } else {
           switch (cartType){
               case "Type 1":
                   creditLimit += creditLimit * 0.25;
                   break;
               case "Type 2":
                   creditLimit += creditLimit * 0.35;
                   break;
               case "Type 3":
                   creditLimit += creditLimit * 0.40;
                   break;
               default:
                   creditLimit += creditLimit * 0.50;
                   break;
           }
       }
    }

    private boolean verifyDebtor (){
        if(pendingDebt > 0) {
            return true;
        } else {
            return false;
        }
    }

}



































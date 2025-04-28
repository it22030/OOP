class Wallet {
    private double amount;

    // Method to add money to wallet
    public void addFunds(double money) {
        if(money > 0) amount += money;
    }

    // Method to get the current balance
    public double getFunds() {
        return amount;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addFunds(200);
        System.out.println("Current Balance: $" + myWallet.getFunds());
    }
}


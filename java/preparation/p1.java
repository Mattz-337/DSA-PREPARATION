class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("amount deposited!");
    }
    void displayBalance(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
}

class Main{

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("matthew", 5000);
        b1.deposit(500);
        b1.displayBalance();
    }
    
}
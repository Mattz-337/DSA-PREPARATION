class BankAccount {

    String name = "Matthew";
    double balance = 10000;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.deposit(3000);
        b.withdraw(5000);
        b.display();
    }
}
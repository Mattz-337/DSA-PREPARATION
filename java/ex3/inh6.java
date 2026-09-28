class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    double CalculateInterest(){
        return 0;
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
        super(balance);
    }
    double CalculateInterest(){
        return balance * 5/100;
    }
}

class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(double balance){
        super(balance);
    }
    double CalculateInterest(){
        return balance * 7/100;
    }
}

class main{
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10000);
        FixedDepositAccount f = new FixedDepositAccount(10000);
        System.out.println("Savings Interest: "+s.CalculateInterest());
        System.out.println("Fixed Deposit Interest: "+f.CalculateInterest());
    }
}
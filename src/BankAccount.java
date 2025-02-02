public class BankAccount {

    public static void main(String[] args) {
        
        // Initial balance
        double balance = 2175.37;

        // Transaction 1: Withdraw $302.50;
        balance -= 302.50;

        // Transaction 2: Deposited $50.03;
        balance += 50.03;

        // Transaction 3: Withdraw half of current balance;
        balance /= 2;

        // Transaction 4: Deposit $20.00;
        balance += 20.00;

        // Transaction 5: Withdraw $1;
        --balance;

        // Transaction 6: Deposit paycheck (Doubles the Balance);
        balance *= 2;

        // Transaction 7: Deposit $1;
        ++balance;

        // Output Bob's new balance;
        System.out.println("Bob's new balance after all transactions: $" + balance);
    }
}

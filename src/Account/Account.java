package Account;

public class Account {

    public int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int n) {
        balance = Math.max(balance - n, 0);
    }

    public void put(int n) {
        balance+=n;
    }

    public int checkBalance() {
        return balance;
    }
}

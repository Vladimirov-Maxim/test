package Account;

public class CheckingAccount extends Account{

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int n) {
        balance-=n;
    }

    public int getDebt(){
        return Math.min(0, balance);
    }

}

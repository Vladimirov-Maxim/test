package Account;

public class Deposit extends Account{

    public int period;
    public double percent;
    private int daysPassed = 0;

    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    public void waitDays(int n) {
        daysPassed+=n;
    }

    public boolean isPeriodExpired(){
        return daysPassed > period;
    }

    public double withdraw() {
        int currentBalance = checkBalance();
        return isPeriodExpired() ? currentBalance + currentBalance / 100 * percent : 0;
    }
}

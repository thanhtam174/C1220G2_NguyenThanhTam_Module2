package review_oop.oop_java_1.exercise_2;

public class Account {
    private final double INTEREST_RATE = 0.035;
    private final double FEE = 0.02;
    private long accountNumber;
    private String accountName;
    private double accountAmount;

    public Account() {

    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountAmount = 50;
    }

    public Account(long accountNumber, String accountName, double accountAmount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountAmount = accountAmount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountAmount= $" + accountAmount +
                '}';
    }

    public void inputMoney(double inputMoney) {
        this.accountAmount += inputMoney;
    }

    public void withdrawMoney(double withdrawMoney) {
        this.accountAmount -= (withdrawMoney + FEE);
    }

    public void expiredDate() {
        this.accountAmount += this.accountAmount * INTEREST_RATE;
    }

    public void transfer(Account account, double amountTransferred){
        this.accountAmount -= (amountTransferred+FEE);
        account.accountAmount+=amountTransferred;
    }
}

package basic.codelab03;

public class BankAccount {
    public Money balance;

    public BankAccount(Money balance) {
        this.balance = balance;
    }

    public void addBalance(Money money) {
        if (balance.currency.equals(money.currency)) {
            balance.value = balance.value + money.value;
        } else if (balance.currency.equals("Euro")) {
            balance.value = balance.value + dollarToEuro(money.value);
        } else if(balance.currency.equals("Dollar")) {
            balance.value = balance.value + euroToDollar(money.value);
        }
    }

    public double dollarToEuro(double value) {
        return 0.91 * value;
    }

    public double euroToDollar(double value) {
        return 1.10 * value;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

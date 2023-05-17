package basic.codelab03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void aEuroAccount() {
        BankAccount bankAccount = new BankAccount(new Money(10.50, "Euro"));
        bankAccount.addBalance(new Money(9, "Euro"));
        bankAccount.addBalance(new Money(21, "Dollar"));

        Assertions.assertThat(bankAccount.balance).isEqualTo(new Money(38.61, "Euro"));
    }

    @Test
    void aDollarAccount() {
        BankAccount bankAccount = new BankAccount(new Money(10.50, "Dollar"));
        bankAccount.addBalance(new Money(9, "Dollar"));
        bankAccount.addBalance(new Money(21, "Euro"));

        Assertions.assertThat(bankAccount.balance).isEqualTo(new Money(42.60, "Dollar"));
    }
}

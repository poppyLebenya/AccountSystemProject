package za.ac.nwu.ac.domain.persistance;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AccountTypeTest {

    @Test
    public void getMnemonic() {
        AccountType accountType = new AccountType();
        assertNull(accountType.getMnemonic());

    }
}

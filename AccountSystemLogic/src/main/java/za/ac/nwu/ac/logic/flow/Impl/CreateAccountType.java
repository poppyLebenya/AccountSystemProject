package za.ac.nwu.ac.logic.flow.Impl;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

public interface CreateAccountType {
    default AccountTypeDto create() {
        return create();
    }

    AccountTypeDto create(AccountTypeDto accountType);
}


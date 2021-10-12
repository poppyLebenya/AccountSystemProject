package za.ac.nwu.ac.translator.impl;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;

public interface AccountTranslator {

    default AccountTypeDto create(AccountTypeDto accountTypeDto) {
        return null;
    }

    default AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic) {
        return null;
    }
}


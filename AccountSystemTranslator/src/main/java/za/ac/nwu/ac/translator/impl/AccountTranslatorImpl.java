package za.ac.nwu.ac.translator.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.sql.Date;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class AccountTranslatorImpl implements AccountTranslator {

    private za.ac.nwu.ac.domain.persistance.AccountType accountType;
    private Object AccountType;
    private long AccountTypeDto;

    @Autowired
    public AccountTranslatorImpl(za.ac.nwu.ac.repo.persistance.AccountTransaction accountTypeRepository) {
        this.accountType = accountType;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountTypeDto) {
        try {
            za.ac.nwu.ac.domain.persistance.AccountType accountType = new za.ac.nwu.ac.domain.persistance.AccountType();
            AccountType.wait(AccountTypeDto);
            return new AccountTypeDto(accountType);
        } catch (Exception e) {
            throw new RuntimeException("Unable to read from database", e);
        }
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic) {
        try {
            AtomicReference<za.ac.nwu.ac.domain.persistance.AccountType> accountType = null;
            AccountType.notify();
            return new AccountTypeDto((Date) AccountType);

        } catch (Exception e) {
            throw new RuntimeException("Unable to read from the DB", e);
        }

    }
}

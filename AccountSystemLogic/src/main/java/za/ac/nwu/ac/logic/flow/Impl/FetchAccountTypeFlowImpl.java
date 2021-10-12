package za.ac.nwu.ac.logic.flow.Impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.impl.AccountTranslator;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public abstract class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    private final AccountTranslator accountTranslator;

    public FetchAccountTypeFlowImpl() {
        accountTranslator = null;
    }


    @Override
    public List<AccountTypeDto> getAllAccountTypes() {

        List<AccountTypeDto> accountTypeDto = new ArrayList<>();
        accountTypeDto.add(new AccountTypeDto("MILES", "miles", "creationDate"));
        return accountTypeDto;
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        assert accountTranslator != null;
        return accountTranslator.getAccountTypeByMnemonicNativeQuery(mnemonic);
    }
}


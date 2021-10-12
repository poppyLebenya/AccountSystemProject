package za.ac.nwu.ac.logic.flow.Impl;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import java.util.List;

public interface FetchAccountTypeFlow
    {

        List<AccountTypeDto> getAllAccountypes();

        List<AccountTypeDto> getAllAccountTypes();

        AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
    }



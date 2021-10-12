package za.ac.nwu.ac.logic.flow.Impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.impl.AccountTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("CreateAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountType {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTypeFlowImpl.class);

    private final AccountTranslator accountTranslator;

    public CreateAccountTypeFlowImpl(AccountTranslator accountTranslator) {
        this.accountTranslator = accountTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType) {
        LOGGER.info("This create Object{}", accountType);

        if (accountType.getCreationDate() == null) {
            accountType.setCreationDate();
            LOGGER.info("The creation date was created{}", accountType.getCreationDate());
        }
        AccountTypeDto results = accountTranslator.create(accountType);
        LOGGER.info("The results of creation Date{}", results);
        return results;
    }
}
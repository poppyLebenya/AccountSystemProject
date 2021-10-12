package za.ac.nwu.ac.logic.flow.Impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.ac.translator.impl.AccountTranslator;

@Transactional
@Component
public class ModifyAccountTypeFlowImpl implements  ModifyAccountTypeFlow {

    private final AccountTranslator accountTranslator;

    public ModifyAccountTypeFlowImpl(AccountTranslator accountTranslator)
    {
        this.accountTranslator = accountTranslator;
    }


}

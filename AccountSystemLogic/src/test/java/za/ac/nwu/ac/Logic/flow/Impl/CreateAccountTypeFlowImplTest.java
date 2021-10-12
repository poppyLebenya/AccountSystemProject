package za.ac.nwu.ac.Logic.flow.Impl;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
/*import org.mockito.junit.MockitoJUnitRunner;*/
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.Impl.CreateAccountTypeFlowImpl;
import za.ac.nwu.ac.translator.impl.AccountTranslator;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private AccountTranslator Translator;

    private CreateAccountTypeFlowImpl flow;



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    private void assertNull(AccountTypeDto result) {
    }
}




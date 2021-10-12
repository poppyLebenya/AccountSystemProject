package za.ac.nwu.ac.repo.persistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistance.AccountType;



@Repository
interface AccountTypeRepository<accounttype> extends JpaRepository<accounttype,Long> {


    @Query(value = "SELECT" +
            "     accountType_id,"+
            "     accountTypeName," +
            "     creationDate,"+
            "     mnemonic" +
            "  FROM" +
            "      accountsystem.accounttype" +
            " WHERE mnemonic = : mnemonic", nativeQuery = true)
    accounttype getAccountTypeByMnemonicNativeQuery(String mnemonic);
}

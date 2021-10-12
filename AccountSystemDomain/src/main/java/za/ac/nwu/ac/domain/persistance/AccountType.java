package za.ac.nwu.ac.domain.persistance;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;


@SuppressWarnings("ALL")
@Entity
@Table(name = "accountType", schema = "accountsystem")
public class AccountType extends Date implements Serializable {

    private Long accountType_id;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;



    public AccountType()
    {
        this();

    }

    public AccountType(String mnemonic, String accountTypeName)
    {
        this();

        /*this.accountType_id= accountType_id;*/
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;

    }



    @Id
    @SequenceGenerator(name = "AccountSystem_Seq", sequenceName = "accountsystem.AccountSystem_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "AccountType_ID")
    public long getAccount_Id() {return accountType_id;}

    public void setAccountTypeName(String accountTypeName)
    {
        this.accountTypeName = accountTypeName;
    }

        @Override
        public String toString()
        {
        return "AccountType{" +
                "accountType_id ='"+ accountType_id + '\''+
                "mnemonic='" + mnemonic + '\'' +
                ",AccountTypeName='"+ accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public Iterable<? extends AccountType> findAll(){
        return null;
    }

    public String getMnemonic() {
        return mnemonic;
    }
}
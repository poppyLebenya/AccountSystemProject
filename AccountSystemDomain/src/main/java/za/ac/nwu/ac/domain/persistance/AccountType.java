package za.ac.nwu.ac.domain.persistance;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "accounttype", schema = "accountsystem")
public class AccountType implements Serializable{
    private static long serialversionUID = 4l;
    private int accountType_id;
    private String mnemonic;
    private String AccountTypeName;
    private int transaction_id;
    private Set<AccountTransaction> AccountTransaction;

    public AccountType()
    {

    }

    public AccountType(int accountType_id,String AccountTypeName, String mnemonic, int transaction_id)
    {
        this.accountType_id = accountType_id;
        this.mnemonic = mnemonic;
        this.AccountTypeName = AccountTypeName;
        this.transaction_id=transaction_id;
    }

    public AccountType(String mnemonic, String accountTypeName)
    {
        this.mnemonic = mnemonic;
        this.AccountTypeName = accountTypeName;

    }
    @Id
    @SequenceGenerator(name = "AccountSystem_Seq", sequenceName = "AccountSystem.AccountSystem_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "Account_Type_ID")
    public long getAccount_Id() {return accountType_id;}

    @Column(name = "AccountTypeName")
    public String getAccountTypeName(){return AccountTypeName;}

    @Column(name = "mnemonic")
    public String getMnemonic(){return mnemonic;};

    @Column(name = "creation_Date")
    public LocalDate getTransaction_id(){return  transaction_id;}

    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY,mappedBy = "accountType_id", orphanRemoval = true,cascade = CascadeType.PERSIST)
    public Set<AccountTransaction>getAccountTransaction()
    {
        return AccountTransaction;
    }

    public void setAccountTypeID(long accountType_id)
    {
        this.accountType_id = (int) accountType_id;
    }

    public void setMnemonic(String mnemonic)
    {
        this.mnemonic = mnemonic;
    }

    public void setAccountTypeName(String accountTypeName)
    {
        this.AccountTypeName = accountTypeName;
    }

    public void setTransaction_id(long transaction_id)
    {
        this.transaction_id = (int)transaction_id;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;

        }
        AccountType that = (AccountType) o;
        return Objects.equals(mnemonic,that.mnemonic) && Objects.equals(AccountTypeName, that.AccountTypeName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(accountType_id,mnemonic,AccountTypeName,transaction_id);
    }

    @Override
    public String toString()
    {
        return "AccountType{" +
                "accountTypeID ='"+ accountType_id + '\''+
                "mnemonic='" + mnemonic + '\'' +
                ",AccountTypeName='"+ AccountTypeName + '\'' +
                '}';
    }


}


package za.ac.nwu.ac.domain.persistance;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "transaction", schema = "accountsystem")
public class AccountTransaction implements Serializable
{
    private static final long serialVersionUID = 4L;

    private Long transaction_id;
    private Long balance;
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "accountType_id")
    private AccountType accountType_id;

    public AccountType getAccountType_id() {
        return accountType_id;
    }

    public void setAccountType_id(AccountType accountType_id) {
        this.accountType_id = accountType_id;
    }

    public AccountTransaction()
    {

    }

    public AccountTransaction(long transaction_id, long balance,LocalDate creationDate) {
        this.transaction_id = transaction_id;
        this.balance = balance;
        this.creationDate = creationDate;

    }

    @Id
    @SequenceGenerator(name = "AccountSystem_Seq", sequenceName = "AccountSystem.AccountSystem_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "transaction_id")
    public Long getTransaction_id()
    {
        return transaction_id;
    }

    @Column(name ="balance")
    public Long getBalance()
    {
        return balance;
    }
    @Column(name = "creationDate")
    public LocalDate getCreationDate()
    {
        return creationDate;
    }

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountType_id")
    public long getAccount_id() {return accountType_id;}

    public void setTransactionID(long transactionID)
    {
        this.transactionID = transactionID ;
    }
    public void setMembershipID(long membershipID)
    {
        this.membershipID = membershipID;
    }
    public void setAccountTypeID(long accountTypeID)
    {
        this.accountTypeID = accountTypeID;
    }
    public void setAmount(long amount)
    {
        this.amount =amount;
    }

    public void setTransDate(LocalDate transDate)
    {
        this.transDate = transDate;
    }*/

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
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transaction_id,that.transaction_id) && Objects.equals(balance, that.balance)&& Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public String toString()
    {
        return "AccountTransaction{"+
                "transactionID='" + transaction_id + '\'' +
                ", balance=" + balance +'\''+
                ",creationDate=+" + creationDate +
                '}';
    }





}

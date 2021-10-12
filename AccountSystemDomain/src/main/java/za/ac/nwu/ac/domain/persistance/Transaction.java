package za.ac.nwu.ac.domain.persistance;

import javax.persistence.*;

@Table(name = "transaction_1")
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false)
    private Long transaction_id;

    @ManyToOne
    @JoinColumn(name = "account_type_id_account_type_id")
    private AccountType accountType_id;

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public AccountType getAccountType_id() {
        return accountType_id;
    }

    public void setAccountType_id(AccountType accountType_id) {
        this.accountType_id = accountType_id;
    }
}
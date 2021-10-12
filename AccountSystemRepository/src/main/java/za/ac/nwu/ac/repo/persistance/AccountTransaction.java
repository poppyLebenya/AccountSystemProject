package za.ac.nwu.ac.repo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistance.Transaction;

@Repository
public interface AccountTransaction extends JpaRepository<AccountTransaction, Long> {
}



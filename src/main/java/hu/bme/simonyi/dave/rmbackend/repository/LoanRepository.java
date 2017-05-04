package hu.bme.simonyi.dave.rmbackend.repository;

import hu.bme.simonyi.dave.rmbackend.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2017. 05. 03..
 */
public interface LoanRepository extends JpaRepository<Loan, Long> {
}

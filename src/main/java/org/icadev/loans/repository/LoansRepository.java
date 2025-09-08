package org.icadev.loans.repository;

import org.icadev.loans.entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepository extends JpaRepository<Loans, Long> {

}

package se.linhhn.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.linhhn.ecommerce.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, String> {
}

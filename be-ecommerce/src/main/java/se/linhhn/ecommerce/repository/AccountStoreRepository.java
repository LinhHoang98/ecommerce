package se.linhhn.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.linhhn.ecommerce.entity.AccountStores;

@Repository
public interface AccountStoreRepository extends JpaRepository<AccountStores, String> {
}

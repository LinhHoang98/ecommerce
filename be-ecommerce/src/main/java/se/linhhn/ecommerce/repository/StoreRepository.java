package se.linhhn.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.linhhn.ecommerce.entity.Stores;

@Repository
public interface StoreRepository extends JpaRepository<Stores, String> {
}

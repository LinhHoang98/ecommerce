package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.linhhn.ecommerce.entity.enums.AccountStoreEnum;

import java.io.Serializable;

@Entity
@Table(name = "account_stores")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountStores extends BaseEntity implements Serializable {

    @Enumerated(EnumType.ORDINAL)
    private AccountStoreEnum role;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Accounts account;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Stores store;
}

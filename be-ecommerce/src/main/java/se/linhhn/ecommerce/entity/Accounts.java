package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.linhhn.ecommerce.entity.enums.AccountRoleEnum;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Accounts extends BaseEntity implements Serializable {

    private String username;

    private String password;

    @Enumerated(EnumType.ORDINAL)
    private AccountRoleEnum role;

    @OneToMany(mappedBy = "account")
    private List<AccountStores> accountStores;

    @OneToMany(mappedBy = "account")
    private List<Addresses> addresses;

    @OneToMany(mappedBy = "account")
    private List<Carts> carts;
}

package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.linhhn.ecommerce.entity.enums.CartStatusEnum;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "carts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carts extends BaseEntity implements Serializable {

    @Enumerated(EnumType.ORDINAL)
    private CartStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Accounts account;

    @OneToMany(mappedBy = "cart")
    private List<CartItems> cartItems;

}

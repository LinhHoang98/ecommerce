package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Addresses extends BaseEntity implements Serializable {

    private String detail;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Accounts account;

    @OneToMany(mappedBy = "address")
    private List<Orders> orders;
}

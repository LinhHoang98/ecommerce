package se.linhhn.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "stores")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stores extends BaseEntity implements Serializable {

    private String name;

    private String imageUrl;

    private boolean isMall;

    @OneToMany(mappedBy = "store")
    private List<AccountStores> accountStores;

    @OneToMany(mappedBy = "store")
    private List<Products> products;
}

package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Products extends BaseEntity implements Serializable {

    private String name;

    private String description;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Stores store;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    @OneToMany(mappedBy = "product")
    private List<SubProduct> subProducts;
}

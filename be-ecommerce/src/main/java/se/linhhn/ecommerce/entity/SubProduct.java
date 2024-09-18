package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "sub_product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubProduct extends BaseEntity implements Serializable {

    private String name;

    private String imageUrl;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @OneToMany(mappedBy = "subProduct")
    private List<OrderItems> orderItems;
}

package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.linhhn.ecommerce.entity.enums.OrderStatusEnum;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Orders extends BaseEntity implements Serializable {

    private Long totalAmount;

    private OrderStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Addresses address;

    @OneToMany(mappedBy = "order")
    private List<OrderItems> orderItems;

    @OneToOne(mappedBy = "order")
    private Payments payment;
}

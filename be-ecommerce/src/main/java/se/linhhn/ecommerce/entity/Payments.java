package se.linhhn.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import se.linhhn.ecommerce.entity.enums.PaymentMethodEnum;
import se.linhhn.ecommerce.entity.enums.PaymentStatusEnum;

import java.io.Serializable;

@Entity
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payments extends BaseEntity implements Serializable {

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethodEnum method;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatusEnum status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order;
}

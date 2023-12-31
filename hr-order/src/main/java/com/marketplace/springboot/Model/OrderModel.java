package com.marketplace.springboot.Model;


import com.marketplace.springboot.Enum.OrderStatus;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_order")
public class OrderModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID orderEntityId;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private LocalDateTime orderDate;

    private BigDecimal totalPrice;
}

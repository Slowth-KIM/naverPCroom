package springProject.naverPcroom.domain;


import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private Member member;

    private List<OrderItem> orderItems = new ArrayList<>();

    private Serving serving;

    private LocalDateTime orderDate;

    private OrderStatus status;
}

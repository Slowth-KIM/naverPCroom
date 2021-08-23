package springProject.naverPcroom.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import springProject.naverPcroom.domain.item.Item;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "order_item")
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    private Item item;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;
}

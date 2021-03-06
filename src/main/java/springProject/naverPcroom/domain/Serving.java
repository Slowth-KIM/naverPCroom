package springProject.naverPcroom.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Serving {

    @Id @GeneratedValue
    @Column(name = "serving_id")
    private Long id;

    private Order order;

    private ServingStatus status;
}

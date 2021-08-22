package springProject.naverPcroom.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private  Long id;

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String name;

    private Long seatId;

    private Long remainedTime;

    private List<Order> orders = new ArrayList<>();
}

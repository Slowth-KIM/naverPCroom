package springProject.naverPcroom.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
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

    //비밀번호가 응답시 보이지 않게 하기 위해
    @NotEmpty
    @JsonIgnore
    private String password;


    @NotEmpty
    private String name;

    private Long seatId;

    private Long remainedTime;

    // mappedBy는 주인 정하기, Order 테이블에 있는 member 필드가 주인, 외래키가 있는 쪽이 주인임
    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}

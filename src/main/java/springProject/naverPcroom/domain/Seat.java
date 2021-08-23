package springProject.naverPcroom.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
public class Seat {

    @Id @GeneratedValue
    @Column(name = "seat_id")
    private Long id;

    private String loginId;

    private SeatStatus status;
}

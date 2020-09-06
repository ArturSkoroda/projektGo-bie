package pl.sda.projectExamople;


import lombok.Data;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Data
public class Result {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Pigeon pigeon;
    @ManyToOne
    private Race race;
    private Duration time;


}

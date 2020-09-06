package pl.sda.projectExamople;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Race {
    @Id
    @GeneratedValue
    private  Long id;
    @OneToMany(mappedBy = "")
    private List<Pigeon> pigeonList = new ArrayList<Pigeon>();






}

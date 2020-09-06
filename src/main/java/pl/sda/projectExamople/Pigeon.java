package pl.sda.projectExamople;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity

public class Pigeon {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String owner;
    private String birdId;


    public Pigeon(String birdId, String nameBird, String ovnerName) {
        this.birdId = birdId;
        this.name = nameBird;
        this.owner = ovnerName;
    }
}

package pl.sda.rarcin;

import org.junit.jupiter.api.Test;
import pl.sda.projectExamople.Pigeon;
import pl.sda.projectExamople.RaceDataReader;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RaceDataReaderTest {
    @Test
    void shouldReadOnePigeon() throws IOException {
// given
       RaceDataReader raceDataReader = new RaceDataReader( "C:\\Users\\Artur\\Desktop\\WyscigiProjekt\\src\\test\\resources\\pigeon-test.csv");

//when
 List <Pigeon> pigeonList = raceDataReader.getPigeons();
//then
        assertEquals(1,pigeonList.size());
        Pigeon pigeon = pigeonList.get(0);
        assertEquals("KOTTTT", pigeon.getName());
        assertEquals("Texas Outlaws", pigeon.getOwner());
        assertEquals("19633-AU15-FOYS", pigeon.getBirdId());

    }

}
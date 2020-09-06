package pl.sda.projectExamople;

import org.hibernate.Session;
import pl.sda.projectExamople.Pigeon;
import pl.sda.projectExamople.RaceDataReader;

import java.io.IOException;
import java.lang.module.Configuration;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {

   RaceDataReader raceDataReader = new RaceDataReader("pigeon-racing.csv");

      List <Pigeon> pigeons = raceDataReader.getPigeons();


        Session session = new Configuration()

        session.save(pigeon);
        transaction.commit();
        session.close();
    }
}

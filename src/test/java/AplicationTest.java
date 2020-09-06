import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import pl.sda.projectExamople.Pigeon;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AplicationTest {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    @Test
    public void shouldSavePigeon() {
        //given
        Pigeon pigeon = new Pigeon();
        pigeon.setName("Bielik");
        //when
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pigeon);
        transaction.commit();
        session.close();
        Session querySession = sessionFactory.openSession();
        CriteriaQuery<Pigeon> cr = querySession.getCriteriaBuilder().createQuery(Pigeon.class);
        Root<Pigeon> root = cr.from(Pigeon.class);
        Query<Pigeon> query = querySession.createQuery(cr);
        List<Pigeon> result = query.getResultList();
        querySession.close();
        //then
        assertEquals(1, result.size());
        assertEquals("Bielik", result.get(0).getName());
    }
    @AfterAll
    void afterTest(){
        sessionFactory.close();
    }

}

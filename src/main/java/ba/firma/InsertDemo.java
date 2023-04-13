package ba.firma;

import ba.firma.entity.Show;
import org.hibernate.Session;

public class InsertDemo {
    public static void main(String[] args) {
        //Tranzijentan
        Show show = new Show();
        show.setShowTitle("Lude godine");
        show.setNumSeasons((short) 4);
        show.setInitialYear(194l);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        //save i persist
        session.save(show);
        session.getTransaction().commit();
    }
}
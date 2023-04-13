package ba.firma;

import ba.firma.entity.Show;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class RetrieveDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        //QUery 1
        Query query = session.createQuery("from Show");
        List<Show> shows = query.list();
        shows.forEach(System.out::println);
        System.out.println();
        // Query 2
        Query specificQuery = session.createQuery("from Show s where s.showTitle like '%break%'");
        specificQuery
                .list()
                .forEach(System.out::println);
        System.out.println();
        // Query for one specific row
        Show show = (Show)session.get(Show.class, 6);
        System.out.println(show);
        session.getTransaction().commit();
    }
}

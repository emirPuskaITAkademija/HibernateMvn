package ba.firma;

import ba.firma.entity.Show;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        //HibernateUtil -> SINGLETON SessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        Query query = session.createQuery("from Show");//shows
        session.getTransaction().commit();
        List<Show> shows = query.list();
        for (Show show : shows) {
            System.out.println(show);
        }
    }
}
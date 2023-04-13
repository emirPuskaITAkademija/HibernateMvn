package ba.firma;

import ba.firma.entity.Show;
import org.hibernate.Session;

public class DeleteDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        Show show = (Show) session.get(Show.class, 9);
        if(show != null){
            session.delete(show);
        }
        session.getTransaction().commit();
    }
}

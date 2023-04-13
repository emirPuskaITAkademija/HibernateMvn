package ba.firma;

import ba.firma.entity.Show;
import org.hibernate.Session;

public class UpdateDemo {
    public static void main(String[] args) {
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        session1.getTransaction().begin();
        Show show = (Show) session1.get(Show.class, 9);
        System.out.println("DOVUČEN: " + show);
        show.setShowTitle("Žikina Dinastija 4");
        session1.update(show);
        session1.getTransaction().commit();
    }
}

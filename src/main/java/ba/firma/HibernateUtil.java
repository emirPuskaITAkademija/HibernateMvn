package ba.firma;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * SINGLETON instancu {@link org.hibernate.SessionFactory}
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                Configuration configuration = new Configuration();
                configuration.configure();
                //local session factory objekat
                sessionFactory = configuration.buildSessionFactory();
            }catch (HibernateException exception){
                System.err.println(exception.getMessage());
            }
        }
        return  sessionFactory;
    }
}

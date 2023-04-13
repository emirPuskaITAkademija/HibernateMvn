package ba.firma.entity;

import ba.firma.HibernateUtil;
import org.hibernate.Session;

public class ActiveBankAccount {

    public BankAccount getThis(){
        return (BankAccount) this;
    }

    public void save(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(getThis());
        session.getTransaction().commit();
    }
}

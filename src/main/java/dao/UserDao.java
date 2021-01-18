package dao;

import model.People;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {
    public People findById(int id){
            return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(People.class,id);
    }
    public void save(People people){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(people);
        tx1.commit();
        session.close();
    }
    public void update(People people){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(people);
        tx1.commit();
        session.close();
    }
    public void delete(People people){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(people);
        transaction.commit();
        session.close();
    }

}

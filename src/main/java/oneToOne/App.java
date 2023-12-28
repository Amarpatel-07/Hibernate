package oneToOne;

import com.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {

        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session= sessionFactory.openSession();
        session.beginTransaction();

        Address a= new Address();
        a.setAddressid(100);
        a.setAddress("E-50 Dwarka extn");
        a.setState("New Delhi");
        a.setPincode(110074);


        Student1 s= new Student1();
        s.setId(2);
        s.setName("Amar Jyoti Patel");
        s.setCourse("BTech");
        s.setAddress(a);

        a.setStudent1(s);

        session.save(a);
        session.save(s);
        session.getTransaction().commit();
        session.close();
        System.out.println("saved successfully");
    }
}
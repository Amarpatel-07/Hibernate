package EagerLazy;

import com.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App4 {

    public static void main(String[] args) {


        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        Session session= sessionFactory.openSession();
        Session session1 = sessionFactory.openSession();
//        session.beginTransaction();
//
//        Address4 a= new Address4();
//        a.setAddressid(101);
//        a.setAddress("E-50 Dwarka extn");
//        a.setState("New Delhi");
//        a.setPincode(110074);
//
//        Student4 s= new Student4();
//        s.setId(1);
//        s.setName("Amar Jyoti Patel");
//        s.setCourse("BTech");
//        s.getAddress().add(a);
//
//        session.save(a);
//        session.save(s);

//        Student4 s1 = session.get(Student4.class,1);
//        System.out.println("Hello");
//        System.out.println(s1);
//        session.getTransaction().commit();
//        session.close();

        session1.beginTransaction();
        Student4 s1 = session1.get(Student4.class,1);
        System.out.println("hello");
        session1.getTransaction().commit();
        session1.close();

        System.out.println(s1);

//        System.out.println(s1);
//        System.out.println(s1.getId());
//        System.out.println(s1.getName());
//        System.out.println(s1.getCourse());


    }
}

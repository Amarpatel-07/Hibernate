package manyToMany;

import com.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App3
{
    public static void main( String[] args )
    {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session= sessionFactory.openSession();
        session.beginTransaction();

        Address3 a= new Address3();
        a.setAddressid(101);
        a.setAddress("E-50 Dwarka extn");
        a.setState("New Delhi");
        a.setPincode(110074);


        Student3 s= new Student3();
        s.setId(1);
        s.setName("Amar Jyoti Patel");
        s.setCourse("BTech");
        s.getAddress().add(a);

        a.getStudent3().add(s);




        Address3 a1= new Address3();
        a1.setAddressid(102);
        a1.setAddress("Dwarka extn");
        a1.setState(" Delhi");
        a1.setPincode(110034);


        Student3 s1= new Student3();
        s1.setId(2);
        s1.setName("Amar Jyoti Patel ");
        s1.setCourse("BE");
        s1.getAddress().add(a1);

        a1.getStudent3().add(s1);

        session.save(a);
        session.save(s);

        session.getTransaction().commit();

        session.beginTransaction();
        session.save(a1);
        session.save(s1);

        session.getTransaction().commit();
        session.close();
        System.out.println("saved successfully");

        // 4 tables will be created in db if mapped by is not used i.e. Student3 , Address3 , Address3_Student3 and Student3_Address3  consisting of primary keys of both
        // both thinks that it is their responsibility to map
        
        // if mapped by is used in student2 class then the id column of address will be added to student table


    }
}
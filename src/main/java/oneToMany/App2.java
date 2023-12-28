package oneToMany;

import com.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class App2
{
    public static void main( String[] args )
    {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session= sessionFactory.openSession();
        Session session1= sessionFactory.openSession();

        Address2 a= new Address2();
        a.setAddressId(104);
        a.setAddress("E-50 Dwarka extn");
        a.setState("New Delhi");
        a.setPincode(110074);

        Address2 a1= new Address2();
        a.setAddressId(102);
        a.setAddress("Mayur vihar");
        a.setState("New Delhi");
        a.setPincode(110054);


        Address2 a2= new Address2();
        a.setAddressId(106);
        a.setAddress("vihar");
        a.setState("New Delhi");
        a.setPincode(11054);

        List<Address2> list = new ArrayList<>();
        list.add(a);
        list.add(a1);
//        list.add(a2);

        Student2 s= new Student2();
        s.setId(1);
        s.setName("Amar Jyoti Patel");
        s.setCourse("BTech");
        s.setAddress(list);
        a.setStudent2(s);
//        a.setStudent2(s);



        session.beginTransaction();
        session.save(s);
        session.save(a);
        session.save(a1);
//        session.save(a2);
        session.getTransaction().commit();
        session.close();
        System.out.println("saved successfully");

        // 3 tables will be created in db if mapped by is not used i.e. Student2 , Address2 and Student2_Address2 consisting of primary keys of both
        // Address table will also contain student id

        // if mapped by is used in student2 class then the id column of address will be added to student table


    }
}
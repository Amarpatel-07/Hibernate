package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class UpdateStudent {
    public static void main(String[] args)  {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student = (Student)session.get(Student.class, 12);  //select * from Student where ID=2;
        student.setStudentName("Ishu22"); //update where id=2
        System.out.println("Updated Successfully");
        session.update(student);
        session.getTransaction().commit();
        sessionFactory.close();
        student.setStudentName("Ishu72"); //update where id=2
    }
}


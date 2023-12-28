package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
    public static void main(String[] args)  {
        //Create student entity object
        Student student = new Student();
        student.setId(12);
        student.setStudentName("Amar Jyoti Patel"); //Ishu1, Ishu3
        student.setRollNumber(3); //01, 03
        student.setCourse("BTech");  //BE BTech
        //Create session factory object
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //getting session object from session factory
        Session session = sessionFactory.openSession();
        //getting transaction object from session object
        session.beginTransaction();
        session.save(student);

        System.out.println("Inserted Successfully");
        session.getTransaction().commit();
//        student.setCourse("gjehfv");
//        Student s1=  session.get(Student.class,12);
//        System.out.println(s1);
        session.close();

        sessionFactory.close();
    }
}
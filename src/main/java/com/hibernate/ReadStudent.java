package com.hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadStudent {
    public static void main(String[] args) {
        //Create session factory object
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //getting session object from session factory
        Session session = sessionFactory.openSession();
        //getting transaction object from session object
        session.beginTransaction();
        List<Student> students =  new ArrayList<Student>();
        for (Object oneObject : session.createQuery("FROM Student").getResultList()) {
            students.add((Student)oneObject);   }

        //   List<Student> students = (List<Student>)session.createQuery("FROM Student").getResultList();
        //System.out.println(students); //if Student.toString() exists
        for(Student student : students)  {
            System.out.println("Roll Number: "+student.getRollNumber()+", Student Name: "+student.getStudentName()+", Course: "+student.getCourse());	  }

        session.getTransaction().commit();
        sessionFactory.close();
    }
}

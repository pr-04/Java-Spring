package com.example.hibernateapp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create
            Student s1 = new Student("Alice", "alice@example.com");
            session.save(s1);

            // Read
            List<Student> students = session.createQuery("from Student", Student.class).list();
            for (Student s : students) {
                System.out.println(s);
            }

            // Update
            Student s2 = session.get(Student.class, 1);
            if (s2 != null) {
                s2.setEmail("alice_updated@example.com");
                session.update(s2);
            }

            // Delete
            Student s3 = session.get(Student.class, 1);
            if (s3 != null) {
                session.delete(s3);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
}

package roig.juanmi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        if (session!=null) {
            System.out.println("Opened Session");
        } else {
            System.out.println("Error opening session");
        }
        System.out.println("END");
    }
}
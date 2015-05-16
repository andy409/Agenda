/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agenda.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Anderson
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    //private static Session session;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

   /* public static Session getSession() {
        if(session != null && !session.isOpen()){
            setSession(null);
        }
        if(session==null){
            session = getSessionFactory().openSession();
        }        
        return session;
    } 

    public static void setSession(Session session) {
        HibernateUtil.session = session;
    }*/
}

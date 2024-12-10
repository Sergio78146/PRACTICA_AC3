package es.studium.practica3;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Carga la configuración de Hibernate desde el archivo hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Si ocurre un error, lanza una excepción con un mensaje.
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        // Devuelve la instancia de SessionFactory para gestionar sesiones con la base de datos.
        return sessionFactory;
    }

    public static void shutdown() {
        // Cierra la fábrica de sesiones al finalizar el programa.
        getSessionFactory().close();
    }
}


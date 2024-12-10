package es.studium.practica3;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class HotelManager {

    public void crear(Cliente cliente) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Inicia una transacción para guardar un cliente.
            transaction = session.beginTransaction();
            session.save(cliente); // Guarda el cliente en la base de datos.
            transaction.commit(); // Confirma la transacción.
        } catch (Exception e) {
            // Si hay un error, revierte la transacción y muestra el error.
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public List<Cliente> leer() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Recupera todos los clientes de la base de datos usando HQL.
            return session.createQuery("from Cliente", Cliente.class).list();
        }
    }

    public void actualizar(int id, Cliente datosActualizados) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Cliente cliente = session.get(Cliente.class, id); // Busca el cliente por ID.
            if (cliente != null) {
                // Actualiza los datos del cliente con los valores proporcionados.
                cliente.setNombre(datosActualizados.getNombre());
                cliente.setApellidos(datosActualizados.getApellidos());
                cliente.setEmail(datosActualizados.getEmail());
                cliente.setDni(datosActualizados.getDni());
                cliente.setClave(datosActualizados.getClave());
                session.update(cliente); // Aplica los cambios a la base de datos.
            }
            transaction.commit(); // Confirma la transacción.
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Cliente cliente = session.get(Cliente.class, id); // Busca el cliente por ID.
            if (cliente != null) {
                session.delete(cliente); // Elimina el cliente de la base de datos.
            }
            transaction.commit(); // Confirma la transacción.
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}

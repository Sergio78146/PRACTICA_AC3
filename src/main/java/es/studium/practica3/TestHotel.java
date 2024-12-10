package es.studium.practica3;

import java.util.List;

public class TestHotel {
    public static void main(String[] args) {
        HotelManager manager = new HotelManager();

        // Crear y guardar clientes en la base de datos.
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setApellidos("Pérez");
        cliente1.setEmail("juan.perez@gmail.com");
        cliente1.setDni("12345678A");
        cliente1.setClave("password123");
        manager.crear(cliente1); // Guarda cliente1.

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Pedro");
        cliente2.setApellidos("Balotelli");
        cliente2.setEmail("balotelli@gmail.com");
        cliente2.setDni("11111111A");
        cliente2.setClave("111111111");
        manager.crear(cliente2); // Guarda cliente2.

        // Leer y mostrar todos los clientes.
        List<Cliente> clientes = manager.leer();
        System.out.println("CLIENTES: ");
        clientes.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellidos()));

       // Actualizar cliente en la base de datos.
        cliente2.setNombre("Mario");
        manager.actualizar(cliente2.getIdCliente(), cliente2);

        // Leer y mostrar los clientes actualizados.
        List<Cliente> clientesActualizados = manager.leer();
        System.out.println("CLIENTES ACTUALIZADOS: ");
        clientesActualizados.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellidos()));

        // Eliminar cliente de la base de datos.
        manager.eliminar(cliente1.getIdCliente());
        
     // Leer y mostrar los clientes tras la eliminación
        List<Cliente> clientesTrasEliminacion = manager.leer();
        System.out.println("CLIENTES ACTUALIZADOS TRAS LA ELIMINACIÓN: ");
        clientesTrasEliminacion.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellidos()));
    }
}

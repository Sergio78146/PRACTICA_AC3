package es.studium.practica3;

 
import java.util.List;

public class TestHotel {
    public static void main(String[] args) {
        HotelManager manager = new HotelManager();

        // Crear
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setApellidos("Pérez");
        cliente1.setEmail("juan.perez@gmail.com");
        cliente1.setDni("12345678A");
        cliente1.setClave("password123");
        manager.crear(cliente1);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Pedro");
        cliente2.setApellidos("Balotelli");
        cliente2.setEmail("balotelli@gmail.com");
        cliente2.setDni("11111111A");
        cliente2.setClave("111111111");
        manager.crear(cliente2);

        // Leer
        List<Cliente> clientes = manager.leer();
        System.out.println("CLIENTES: ");
        clientes.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellidos() + " " +
        		c.getEmail() + " " + c.getDni() + " " + c.getClave()));

        // Actualizar
        cliente1.setNombre("Juanito");
        manager.actualizar(cliente1.getIdCliente(), cliente1);
        
        cliente2.setNombre("Mario");
        manager.actualizar(cliente2.getIdCliente(), cliente2);

        // Leer tras la actualización
        List<Cliente> clientesActualizados = manager.leer();
        System.out.println("CLIENTES: ");
        clientesActualizados.forEach(c -> System.out.println(c.getNombre() + " " + c.getApellidos() + " " +
        		c.getEmail() + " " + c.getDni() + " " + c.getClave()));
        
        
        // Eliminar
        manager.eliminar(cliente1.getIdCliente());
        manager.eliminar(cliente2.getIdCliente());

    }
}

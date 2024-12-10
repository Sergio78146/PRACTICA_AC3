package es.studium.practica3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indica que esta clase es una entidad gestionada por Hibernate.
@Table(name = "clienteSergio") // Especifica que esta clase se corresponde con la tabla "clienteSergio" en la base de datos.
public class Cliente {

    @Id // Marca este atributo como la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor del ID será generado automáticamente por la base de datos.
    private int idCliente;

    private String nombre; // Campo para almacenar el nombre del cliente.
    private String apellidos; // Campo para almacenar los apellidos del cliente.
    private String email; // Campo para almacenar el correo electrónico del cliente.
    private String dni; // Campo para almacenar el DNI del cliente.
    private String clave; // Campo para almacenar la contraseña del cliente.

    // Getters y setters para acceder y modificar los atributos.
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
}

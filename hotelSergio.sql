CREATE DATABASE hotelSergio
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_spanish_ci;
  
USE hotelSergio;

CREATE TABLE clienteSergio (
    idCliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellidos VARCHAR(100),
    email VARCHAR(100),
    dni VARCHAR(20),
    clave VARCHAR(100)
);
 
select * from clienteSergio;

TRUNCATE TABLE clienteSergio;


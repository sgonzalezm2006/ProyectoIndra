-- Crear base de datos

CREATE DATABASE IF NOT EXISTS PortalEventos;
USE PortalEventos;

-- Tabla de Categorías

CREATE TABLE Categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de Ubicaciones

CREATE TABLE Ubicaciones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    online BOOLEAN NOT NULL,
    direccion VARCHAR(255)
);

-- Tabla de Organizadores

CREATE TABLE Organizadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

-- Tabla de Usuarios

CREATE TABLE Usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

-- Tabla de Eventos

CREATE TABLE Eventos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    fecha DATE NOT NULL,
    duracion INT NOT NULL, -- duración en minutos
    id_ubicacion INT NOT NULL,
    id_organizador INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_ubicacion) REFERENCES Ubicaciones(id),
    FOREIGN KEY (id_organizador) REFERENCES Organizadores(id),
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id)
);


-- Tabla de Inscripciones

CREATE TABLE Inscripciones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_evento INT NOT NULL,
    cancelado BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id),
    FOREIGN KEY (id_evento) REFERENCES Eventos(id)
);
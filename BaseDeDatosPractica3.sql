CREATE TABLE Funcionario (
    cedula VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(100),
    puesto VARCHAR(100),
    contraseña VARCHAR(100)
);

CREATE TABLE Producto (
    numeroSerial INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio DOUBLE
);

CREATE TABLE Compra (
    numeroDeCompra INT PRIMARY KEY AUTO_INCREMENT,
    nombreDelFuncionario VARCHAR(100),
    total DOUBLE,
    fechaYHora DATETIME,
    FOREIGN KEY (nombreDelFuncionario) REFERENCES Funcionario(cedula)
);

CREATE TABLE ProductoCompra (
    id INT PRIMARY KEY AUTO_INCREMENT,
    numeroDeCompra INT,
    numeroSerialProducto INT,
    FOREIGN KEY (numeroDeCompra) REFERENCES Compra(numeroDeCompra),
    FOREIGN KEY (numeroSerialProducto) REFERENCES Producto(numeroSerial)
);

CREATE TABLE Cierre (
    numeroDeCierre INT PRIMARY KEY AUTO_INCREMENT,
    totalVenta DOUBLE,
    fecha DATETIME,
    puesto VARCHAR(100)
);
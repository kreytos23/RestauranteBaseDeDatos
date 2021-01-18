### CREAR TABLAS Y LA BASE DE DATOS

CREATE SCHEMA technoteam;

CREATE TABLE `technoteam`.`clientes` (
    `Cli_Id` INT NOT NULL AUTO_INCREMENT,
    `Cli_Nombre` VARCHAR(20) NOT NULL,
    `Cli_Apellido_Paterno` VARCHAR(20) NOT NULL,
    `Cli_Apellido_Materno` VARCHAR(20) NOT NULL,
    `Cli_Email` VARCHAR(50) NOT NULL CHECK (Cli_Email LIKE '%@%'),
    `Cli_Password` VARCHAR(20) NOT NULL CHECK (LENGTH(Cli_Password) > 5),
    `Cli_Colonia` VARCHAR(50) NOT NULL,
    `Cli_Calle` VARCHAR(50) NOT NULL,
    `Cli_Telefono` VARCHAR(15) NOT NULL CHECK (LENGTH(Cli_Telefono) = 10),
    `Cli_Fecha_Nacimiento` DATE NOT NULL,
    PRIMARY KEY (`Cli_Id`),
    UNIQUE INDEX `Cli_Id_UNIQUE` (`Cli_Id` ASC),
    UNIQUE INDEX `Cli_Email_UNIQUE` (`Cli_Email` ASC)
);
  
CREATE TABLE `technoteam`.`tickets` (
    `Tic_Id` INT NOT NULL AUTO_INCREMENT,
    `Tic_Total` INT NOT NULL,
    `Tic_Fecha` DATETIME NOT NULL,
    `Tic_Cliente_Id` INT NOT NULL,
    PRIMARY KEY (`Tic_Id`),
    UNIQUE INDEX `Tic_Id_UNIQUE` (`Tic_Id` ASC),
    INDEX `FK_Ticket_Cliente_idx` (`Tic_Cliente_Id` ASC),
    CONSTRAINT `FK_Cliente_Tickets` FOREIGN KEY (`Tic_Cliente_Id`)
        REFERENCES `technoteam`.`clientes` (`Cli_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE `technoteam`.`platillos` (
    `Pla_Id` INT NOT NULL AUTO_INCREMENT,
    `Pla_Nombre` VARCHAR(40) NOT NULL,
    `Pla_Descripcion` VARCHAR(300) NOT NULL,
    `Pla_Precio` INT NOT NULL CHECK(Pla_Precio >= 10),
    `Pla_Cantidad` INT NOT NULL CHECK(Pla_Cantidad >= 0),
    `Pla_Categoria_Id` INT NOT NULL,
    `Pla_Menu_Id` INT NOT NULL,
    `Pla_Imagen` VARCHAR(250) ,
    PRIMARY KEY (`Pla_Id`),
    UNIQUE INDEX `Pla_Id_UNIQUE` (`Pla_Id` ASC),
    INDEX `FK_Categoria_Platillo_idx` (`Pla_Categoria_Id` ASC),
    INDEX `FK_Menu_Platillo_idx` (`Pla_Menu_Id` ASC),
    CONSTRAINT `FK_Categoria_Platillo` FOREIGN KEY (`Pla_Categoria_Id`)
        REFERENCES `technoteam`.`categorias` (`Cat_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `FK_Menu_Platillo` FOREIGN KEY (`Pla_Menu_Id`)
        REFERENCES `technoteam`.`menus` (`Menu_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE
);
  
CREATE TABLE `technoteam`.`categorias` (
    `Cat_Id` INT NOT NULL AUTO_INCREMENT,
    `Cat_Nombre` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`Cat_Id`)
);

CREATE TABLE `technoteam`.`menus` (
    `Menu_Id` INT NOT NULL AUTO_INCREMENT,
    `Menu_Tipo` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`Menu_Id`)
);

CREATE TABLE `technoteam`.`empleados` (
    `Emp_Id` INT NOT NULL AUTO_INCREMENT,
    `Emp_Nombre` VARCHAR(20) NOT NULL,
    `Emp_Apellido_Paterno` VARCHAR(20) NOT NULL,
    `Emp_Apellido_Materno` VARCHAR(20) NOT NULL,
    `Emp_Colonia` VARCHAR(30) NOT NULL,
    `Emp_Calle` VARCHAR(40) NOT NULL,
    `Emp_Email` VARCHAR(40) NOT NULL CHECK(Emp_Email LIKE ('%@%')),
    `Emp_Password` VARCHAR(15) NOT NULL CHECK (LENGTH(Emp_Password) > 5),
    `Emp_Fecha_Nacimiento` DATE NOT NULL,
    `Emp_Telefono` VARCHAR(20) NOT NULL CHECK (LENGTH(Emp_Telefono) = 10),
    `Emp_Foto` VARCHAR(200),	
    `Emp_Id_Tipo` INT NOT NULL,
    PRIMARY KEY (`Emp_Id`),
    UNIQUE INDEX `Emp_Email_UNIQUE` (`Emp_Email` ASC),
    INDEX `FK_Tipo_Empleado_idx` (`Emp_Id_Tipo` ASC),
    CONSTRAINT `FK_Tipo_Empleado` FOREIGN KEY (`Emp_Id_Tipo`)
        REFERENCES `technoteam`.`tipos` (`Tipo_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `technoteam`.`tipos` (
    `Tipo_Id` INT NOT NULL AUTO_INCREMENT,
    `Tipo_Nombre` VARCHAR(20) NOT NULL,
    `Tipo_Sueldo` INT NOT NULL CHECK (Tipo_Sueldo > 1000 AND Tipo_Sueldo < 30000),
    PRIMARY KEY (`Tipo_Id`)
);

CREATE TABLE `technoteam`.`admin_menu` (
    `AM_Id` INT NOT NULL AUTO_INCREMENT,
    `AM_Admin_Id` INT NOT NULL,
    `AM_Menu_Id` INT NOT NULL,
    PRIMARY KEY (`AM_Id`),
    INDEX `FK_Menus_idx` (`AM_Menu_Id` ASC),
    INDEX `FK_Admin_idx` (`AM_Admin_Id` ASC),
    CONSTRAINT `FK_Menus` FOREIGN KEY (`AM_Menu_Id`)
        REFERENCES `technoteam`.`menus` (`Menu_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `FK_Admin` FOREIGN KEY (`AM_Admin_Id`)
        REFERENCES `technoteam`.`empleados` (`Emp_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `technoteam`.`platillo_ticket` (
    `PT_Id` INT NOT NULL AUTO_INCREMENT,
    `PT_Platillo_Id` INT NOT NULL,
    `PT_Ticket_Id` INT NOT NULL,
    `Cantidad_Platillo` INT NOT NULL,
    PRIMARY KEY (`PT_Id`),
    INDEX `FK_platillo_idx` (`PT_Platillo_Id` ASC),
    INDEX `FK_Ticket_idx` (`PT_Ticket_Id` ASC),
    CONSTRAINT `FK_platillo` FOREIGN KEY (`PT_Platillo_Id`)
        REFERENCES `technoteam`.`platillos` (`Pla_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `FK_Ticket` FOREIGN KEY (`PT_Ticket_Id`)
        REFERENCES `technoteam`.`tickets` (`Tic_Id`)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE technoteam.ticketsBorrados (
    TicB_Id INT NOT NULL AUTO_INCREMENT,
    TicB_Total INT NOT NULL,
    TicB_Fecha DATETIME NOT NULL,
    TicB_Cliente_Id INT NOT NULL,
    PRIMARY KEY (TicB_Id),
    UNIQUE INDEX TicB_Id_UNIQUE (TicB_Id ASC),
    INDEX FK_TicketB_Cliente_idx (TicB_Cliente_Id ASC),
    CONSTRAINT FK_ClienteB_Tickets FOREIGN KEY (TicB_Cliente_Id)
        REFERENCES technoteam.clientes (Cli_Id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE technoteam.empleadosBorrados (
    EmpB_Id INT NOT NULL AUTO_INCREMENT,
    EmpB_Nombre VARCHAR(20) NOT NULL,
    EmpB_Apellido_Paterno VARCHAR(20) NOT NULL,
    EmpB_Apellido_Materno VARCHAR(20) NOT NULL,
    EmpB_Colonia VARCHAR(30) NOT NULL,
    EmpB_Calle VARCHAR(40) NOT NULL,
    EmpB_Email VARCHAR(40) NOT NULL CHECK(EmpB_Email LIKE '%@%'),
    EmpB_Password VARCHAR(15) NOT NULL CHECK (LENGTH(EmpB_Password) > 5),
    EmpB_Fecha_Nacimiento DATE NOT NULL,
    EmpB_Telefono VARCHAR(20) NOT NULL CHECK (LENGTH(EmpB_Telefono) = 10),
    EmpB_Foto VARCHAR(200),
    EmpB_Id_Tipo INT NOT NULL,
    PRIMARY KEY (EmpB_Id),
    UNIQUE INDEX EmpB_Email_UNIQUE (EmpB_Email ASC),
    INDEX FK_TipoB_Empleado_idx (EmpB_Id_Tipo ASC),
    CONSTRAINT FK_TipoB_Empleado FOREIGN KEY (EmpB_Id_Tipo)
        REFERENCES technoteam.tipos (Tipo_Id)
        ON DELETE CASCADE ON UPDATE CASCADE
);

### SELECTS DE LA TABLAS

SELECT * FROM empleados;
SELECT * FROM admin_menu;
SELECT * FROM clientes;
SELECT * FROM menus;
SELECT * FROM empleadosborrados;
SELECT * FROM ticketsborrados;

SELECT * FROM tickets;
SELECT * FROM tipos;
SELECT * FROM platillo_ticket;
SELECT * FROM categorias;
SELECT * FROM platillos;

SELECT * FROM platillos
WHERE Pla_Categoria_Id = 2;

SELECT * FROM platillos
WHERE  Pla_Menu_Id = 1;

### ALTER PARA LOS AUTO INCREMENTS
ALTER TABLE platillos AUTO_INCREMENT = 1;

### DELETE PARA DATOS DE LAS TABLAS
    
DELETE FROM empleados;
DELETE FROM clientes;
DELETE FROM platillos;
DELETE FROM categorias;
DELETE FROM tickets;
DELETE FROM menus;
DELETE FROM tipos;
DELETE FROM admin_menu;
DELETE FROM platillo_ticket;
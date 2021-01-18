CREATE PROCEDURE ObtenerClienteConId (IN id_cliente INT)
	SELECT * FROM clientes
    WHERE Cli_Id = id_cliente;
    
CREATE PROCEDURE ObtenerClienteConApellidos(IN A_Paterno VARCHAR(20), IN A_Materno VARCHAR(20))
	SELECT * FROM clientes
		WHERE Cli_Apellido_Paterno = A_Paterno AND Cli_Apellido_Materno = A_Materno;


CREATE PROCEDURE LoginCliente(IN Correo VARCHAR(50), IN Pass VARCHAR(50))
	SELECT * FROM clientes
		WHERE Cli_Email = Correo AND Cli_Password = Pass;
        

CREATE PROCEDURE LoginAdmin(IN Correo VARCHAR(50), IN Pass VARCHAR(50))
	SELECT * FROM empleados
    INNER JOIN tipos ON empleados.Emp_Id_Tipo = tipos.Tipo_Id
		WHERE Emp_Email = Correo AND Emp_Password = Pass AND Emp_Id_Tipo = 4;
        
CREATE PROCEDURE NuevoEmpleado(IN Nombre VARCHAR(50), IN ApellidoP VARCHAR(50),
								IN ApellidoM VARCHAR(50),IN Email VARCHAR(50),
								IN Pass VARCHAR(50),IN Colonia VARCHAR(50),
                                IN Calle VARCHAR(50),IN Fecha DATE,
                                IN Telefono VARCHAR(50), IN Tipo_Id INT)
		INSERT INTO empleados 
        (Emp_Nombre,Emp_Apellido_Paterno,Emp_Apellido_Materno, Emp_Email,
        Emp_telefono,Emp_Calle,Emp_Colonia,Emp_Fecha_Nacimiento,Emp_Password,Emp_Id_Tipo) 
        VALUES
        (Nombre,ApellidoP,ApellidoM,Email,Telefono,Calle,Colonia,Fecha,Pass,Tipo_Id);

CREATE PROCEDURE EliminarEmpleado(IN IdEliminar INT )
	DELETE FROM empleados
		WHERE Emp_Id = IdEliminar;

CREATE PROCEDURE ActualizarEstado(IN IdModificar INT)
	UPDATE platillos 
		SET Pla_Estatus = 'Activo'
        WHERE Pla_Id = IdModificar;

CREATE PROCEDURE ActualizarPlatillos(IN IdPlatillo INT, IN Estado VARCHAR(15))
	UPDATE platillos
		SET Pla_Estatus = Estado
        WHERE Pla_Id = IdPlatillo;

CREATE PROCEDURE ActualizarEmpleadoSinCorreo(IN IdEmpleado INT,IN Calle VARCHAR(50), IN Colonia VARCHAR(50), IN Pass VARCHAR(50),IN Telefono VARCHAR(15))
	UPDATE empleados
		SET Emp_Calle = Calle,
			Emp_Colonia = Colonia,
            Emp_Password = Pass,
            Emp_Telefono = Telefono
		WHERE EMP_Id = IdEmpleado;

CREATE PROCEDURE ActualizarEmpleadoConCorreo(IN IdEmpleado INT,IN Calle VARCHAR(50), IN Colonia VARCHAR(50), IN Pass VARCHAR(50),IN Telefono VARCHAR(15),In Correo VARCHAR(50))
	UPDATE empleados
		SET Emp_Calle = Calle,
			Emp_Colonia = Colonia,
            Emp_Password = Pass,
            Emp_Telefono = Telefono,
            Emp_Email = Correo
		WHERE EMP_Id = IdEmpleado;
        
CREATE PROCEDURE ActualizarClienteSinCorreo(IN IdCliente INT,IN Calle VARCHAR(50), IN Colonia VARCHAR(50), IN Pass VARCHAR(50),IN Telefono VARCHAR(15))
    UPDATE clientes
        SET Cli_Calle = Calle,
            Cli_Colonia = Colonia,
            Cli_Password = Pass,
            Cli_Telefono = Telefono
        WHERE Cli_Id = IdCliente;

CREATE PROCEDURE ActualizarClienteConCorreo(IN IdCliente INT,IN Calle VARCHAR(50), IN Colonia VARCHAR(50), IN Pass VARCHAR(50),IN Telefono VARCHAR(15),In Correo VARCHAR(50))
    UPDATE clientes
        SET Cli_Calle = Calle,
            Cli_Colonia = Colonia,
            Cli_Password = Pass,
            Cli_Telefono = Telefono,
            Cli_Email = Correo
        WHERE Cli_Id = IdCliente;
        
CREATE PROCEDURE AgregarTicket(IN IdTicket INT, IN Total INT, IN Fecha DATE, IN Cliente INT)
	INSERT INTO tickets (Tic_Id, Tic_Total,Tic_Fecha, Tic_Cliente_Id) 
		VALUES
		(IdTicket,Total,Fecha,Cliente);
        
CREATE PROCEDURE AgregarTicketPlatillos(IN IdTicket INT, IN IdPlatillo INT, IN Cantidad INT)
	INSERT INTO platillo_ticket (PT_Ticket_Id, PT_Platillo_Id, Cantidad_Platillo) 
		VALUES
		(IdTicket,IdPlatillo, Cantidad);
        
CREATE PROCEDURE TicketsDeCliente(IN IdCliente INT)
	SELECT * FROM tickets
		WHERE Tic_Cliente_Id = IdCliente;
        
CREATE PROCEDURE PlatillosDeTickets(IN IdTicket INT)
	SELECT * FROM platillo_ticket
    INNER JOIN platillos ON Pla_Id = PT_Platillo_Id
		WHERE PT_Ticket_Id = IdTicket; 
    
CREATE PROCEDURE RestarCantidad(IN Cantidad INT, IN IdPlatillo INT)
	UPDATE platillos
    SET Pla_Cantidad = Cantidad
		WHERE  Pla_Id = IdPlatillo;
    
DELIMITER $$    
CREATE PROCEDURE EliminarTickets(IN TicketId INT)
	BEGIN
    DELETE FROM platillo_ticket
		WHERE PT_Ticket_Id = TicketId;
        
	DELETE FROM tickets
		WHERE Tic_Id = TicketId;
	END;
    

CALL EliminarTickets(7);
CALL PlatillosDeTickets(3);    
CALL TicketsDeCliente(3);    
CALL AgregarTicket;
CALL ActualizarEstado(1);
CALL EliminarEmpleado(34);
CALL ActualizarPlatillos(1, 'Inactivo');
CALL NuevoEmpleado('Pancho','Bazaldua','Martin','cesarLau12gmail.com','cesar123','Pedregal','Av Evergreen','2001-01-10','5565217895',1);

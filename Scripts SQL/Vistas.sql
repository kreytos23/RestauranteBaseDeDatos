CREATE VIEW traerEmpleados
AS 
	SELECT * FROM empleados
    INNER JOIN tipos ON tipos.Tipo_Id = empleados.Emp_Id_Tipo
    ORDER BY Emp_Id;
   
CREATE VIEW empleados_Nombre_Id 
AS
	SELECT Emp_Nombre, Emp_Apellido_Paterno,Emp_Apellido_Materno FROM empleados;

CREATE VIEW traerPlatillos 
AS
	SELECT * FROM platillos 
		INNER JOIN menus ON menus.Menu_Id = platillos.Pla_Menu_Id
        INNER JOIN categorias ON categorias.Cat_Id = platillos.Pla_Categoria_Id
        ORDER BY Pla_Id ASC;

CREATE VIEW PlatillosActivos
AS
	SELECT * FROM platillos
    INNER JOIN menus ON menus.Menu_Id = platillos.Pla_Menu_Id
    INNER JOIN categorias ON categorias.Cat_Id = platillos.Pla_Categoria_Id
         WHERE Pla_Estatus = 'Activo'
         ORDER BY Pla_Id ASC;
   

CREATE VIEW IdDeTicket
AS
	SELECT MAX(Tic_Id) AS MaxId FROM tickets;


    
SELECT * FROM PlatillosActivos;
SELECT * FROM traerPlatillos ;
SELECT * FROM empleados_view;
SELECT * FROM traerEmpleados;


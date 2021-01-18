DELIMITER $$
CREATE TRIGGER empleadosBorrados BEFORE DELETE ON empleados
 FOR EACH ROW
 BEGIN
    INSERT INTO empleadosBorrados
        SELECT * FROM empleados WHERE empleados.Emp_Id = old.Emp_Id;

 END;

DELIMITER $$
CREATE TRIGGER Triggertickesborrados BEFORE DELETE ON tickets
 FOR EACH ROW
 BEGIN
    INSERT INTO ticketsborrados
        SELECT *  FROM tickets WHERE tickets.Tic_Id= old.Tic_Id;

 END;
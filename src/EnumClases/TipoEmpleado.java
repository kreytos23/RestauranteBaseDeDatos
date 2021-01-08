package EnumClases;

public enum TipoEmpleado {
    Chef(1),
    Mesero(2),
    Limpieza(3),
    Gerente(4),
    Finanzas(5),
    Publicidad(6);

    private int idTipo;

    private TipoEmpleado(int idTipo){
        this.idTipo = idTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }
}

package Tablas;

public class Platillos {
    private int Pla_Id;
    private String Pla_Nombre;
    private String Pla_Descripcion;
    private double Pla_Precio;
    private int Pla_Cantidad;
    private String Pla_Estatus;
    private Categorias Pla_Categoria;
    private Menus Pla_Menu;
    private String Pla_Imagen;

    public Platillos(int Pla_Id, String Pla_Nombre, String Pla_Descripcion, double Pla_Precio, int Pla_Cantidad, String Pla_Estatus, Categorias Pla_Categoria, Menus Pla_Menu,String Pla_Imagen) {
        this.Pla_Id = Pla_Id;
        this.Pla_Nombre = Pla_Nombre;
        this.Pla_Descripcion = Pla_Descripcion;
        this.Pla_Precio = Pla_Precio;
        this.Pla_Cantidad = Pla_Cantidad;
        this.Pla_Estatus = Pla_Estatus;
        this.Pla_Categoria = Pla_Categoria;
        this.Pla_Menu = Pla_Menu;
        this.Pla_Imagen = Pla_Imagen;
    }

    public Platillos(int Pla_Id, String Pla_Nombre, double Pla_Precio) {
        this.Pla_Id = Pla_Id;
        this.Pla_Nombre = Pla_Nombre;
        this.Pla_Precio = Pla_Precio;
    }

    public void setPla_Imagen(String Pla_Imagen) {
        this.Pla_Imagen = Pla_Imagen;
    }

    public String getPla_Imagen() {
        return Pla_Imagen;
    }
    
    public String getPla_Estatus() {
        return Pla_Estatus;
    }

    public void setPla_Estatus(String Pla_Estatus) {
        this.Pla_Estatus = Pla_Estatus;
    }

    public int getPla_Id() {
        return Pla_Id;
    }

    public void setPla_Id(int Pla_Id) {
        this.Pla_Id = Pla_Id;
    }

    public String getPla_Nombre() {
        return Pla_Nombre;
    }

    public void setPla_Nombre(String Pla_Nombre) {
        this.Pla_Nombre = Pla_Nombre;
    }

    public String getPla_Descripcion() {
        return Pla_Descripcion;
    }

    public void setPla_Descripcion(String Pla_Descripcion) {
        this.Pla_Descripcion = Pla_Descripcion;
    }

    public double getPla_Precio() {
        return Pla_Precio;
    }

    public void setPla_Precio(double Pla_Precio) {
        this.Pla_Precio = Pla_Precio;
    }

    public int getPla_Cantidad() {
        return Pla_Cantidad;
    }

    public void setPla_Cantidad(int Pla_Cantidad) {
        this.Pla_Cantidad = Pla_Cantidad;
    }

    public Categorias getPla_Categoria() {
        return Pla_Categoria;
    }

    public void setPla_Categoria(Categorias Pla_Categoria) {
        this.Pla_Categoria = Pla_Categoria;
    }

    public Menus getPla_Menu() {
        return Pla_Menu;
    }

    public void setPla_Menu(Menus Pla_Menu) {
        this.Pla_Menu = Pla_Menu;
    }

    @Override
    public String toString() {
        return Pla_Nombre + " - " + Pla_Menu.getMenu_Tipo() + " - " + Pla_Categoria.getCat_Nombre();
    }
}

package Tablas;

public class Menus {
    private int Menu_Id;
    private String Menu_Tipo;

    public Menus(int Menu_Id, String Menu_Tipo) {
        this.Menu_Id = Menu_Id;
        this.Menu_Tipo = Menu_Tipo;
    }

    public Menus(){
    }
    
    public int getMenu_Id() {
        return Menu_Id;
    }

    public void setMenu_Id(int Menu_Id) {
        this.Menu_Id = Menu_Id;
    }

    public String getMenu_Tipo() {
        return Menu_Tipo;
    }

    public void setMenu_Tipo(String Menu_Tipo) {
        this.Menu_Tipo = Menu_Tipo;
    }
}

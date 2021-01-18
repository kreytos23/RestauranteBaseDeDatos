package Tablas;


public class AdminMenu {
    private int AM_Id;
    private Empleados AM_Admin_Id;
    private Menus AM_Menu;

    public int getAM_Id() {
        return AM_Id;
    }

    public void setAM_Id(int AM_Id) {
        this.AM_Id = AM_Id;
    }

    public Empleados getAM_Admin_Id() {
        return AM_Admin_Id;
    }

    public void setAM_Admin_Id(Empleados AM_Admin_Id) {
        this.AM_Admin_Id = AM_Admin_Id;
    }

    public Menus getAM_Menu() {
        return AM_Menu;
    }

    public void setAM_Menu(Menus AM_Menu) {
        this.AM_Menu = AM_Menu;
    }
}

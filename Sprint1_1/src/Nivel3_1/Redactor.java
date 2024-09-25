package Nivel3_1;

import java.util.ArrayList;

public class Redactor {
    private final String dni;
    private String name;
    private static int salary = 230;
    private ArrayList<Noticia> news;

    public Redactor(String name, String dni){
        this.dni = dni;
        this.name = name;
        this.news = new ArrayList<Noticia>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "dni: " + this.dni + " name: " + this.name + " sueldo: "+ salary;
    }
}

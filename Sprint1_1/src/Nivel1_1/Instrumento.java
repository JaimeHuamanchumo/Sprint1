package Nivel1_1;

public abstract class Instrumento {
    private String nombre;
    private int precio;

    public Instrumento(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void metodo(){
        System.out.println("Prueba por metodo estatico");
    }

    public abstract void tocar();
}

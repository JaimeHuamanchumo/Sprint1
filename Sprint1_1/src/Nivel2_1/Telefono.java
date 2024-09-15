package Nivel2_1;

public class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void llamar(String numero){
        System.out.println("Se esta llamando al: " + numero);
    }
}

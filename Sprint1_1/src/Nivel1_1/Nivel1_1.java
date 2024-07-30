package Nivel1_1;

public class Nivel1_1 {
    public static void main(String[] args) {

        Cuerda primero = new Cuerda("Rombo", 15);

        primero.tocar();
        primero.metodo(); //me sigue saliendo error en la implementacion del metodo static de primero porque asumo
        //que no es un metodo propio de cuerda.


    }
}

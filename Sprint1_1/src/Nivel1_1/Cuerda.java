package Nivel1_1;

public class Cuerda extends Instrumento {

    public Cuerda(String nombre, int precio){
        super(nombre,precio);
    }

    @Override
    String tocar() {
        return "Se esta tocando un instrumento de cuerda";
    }
}

package Nivel1_1;

public class Viento extends Instrumento {

    public Viento (String nombre, int precio) {
        super(nombre,precio);
    }

    @Override
    String tocar() {
        return "Se esta tocando un instrumento de viento";
    }
}

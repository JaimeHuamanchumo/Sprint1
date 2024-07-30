package Nivel1_1;

public class Viento extends Instrumento {

    public Viento (String nombre, int precio) {
        super(nombre,precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se esta tocando un instrumento de viento");
    }
}

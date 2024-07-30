package Nivel1_1;

public class Cuerda extends Instrumento {

    public Cuerda(String nombre, int precio){
        super(nombre,precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se esta tocando un instrumento de cuerda");
    }
}

package Nivel1_1;

public class Percusion extends Instrumento {

    public Percusion(String nombre, int precio){
        super(nombre,precio);
    }

    @Override
    public void tocar() {
        System.out.println("Se esta tocando un instrumento de percusion");
    }
}

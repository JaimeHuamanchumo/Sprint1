package Nivel2_1;

public class Smartphone extends Telefono implements Reloj,Camara{

    public Smartphone(String modelo, String marca){
        super(modelo,marca);
    }

    public void alarma(){
        System.out.println("Esta sonando la alarma");
    }

    public void fotografiar(){
        System.out.println("Se esta haciendo una foto");
    }
}


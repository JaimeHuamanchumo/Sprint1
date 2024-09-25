package Nivel1_1;

public class Nivel1_1 {
    public static void main(String[] args) throws EmptySaleException {
        Product perfume = new Product("Romani", 15);
        Product potato = new Product("Lays", 2);
        Product mouse = new Product("Logitech", 55);

        Sale sale = new Sale();
        sale.addProduct(perfume);
        sale.addProduct(potato);
        sale.addProduct(mouse);

        try{
            sale.calcularTotal();
        }catch (EmptySaleException e){
           System.out.println( e.getMessage());


        }


    }
}

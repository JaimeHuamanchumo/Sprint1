package Nivel1_1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private int totalPrice;

    public Sale() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public void calcularTotal() throws EmptySaleException {
        if(products.isEmpty()){
            throw new EmptySaleException();
        }
        totalPrice = (int) 0;
        for(Product product : products ){
            totalPrice += product.getPrice();
        }

        System.out.println("Your total price is: " + totalPrice);
    }

}

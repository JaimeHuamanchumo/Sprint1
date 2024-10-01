package Nivel2_2;

import java.util.HashSet;
import java.util.TreeSet;

public class Nivel2_2 {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Mcdonald's", 5);
        Restaurant restaurant2 = new Restaurant("KFC", 7);
        Restaurant restaurant3 = new Restaurant("BurgerKing", 8);
        Restaurant restaurant4 = new Restaurant("Pans", 7);


        HashSet<Restaurant> restaurants = new HashSet <Restaurant>();

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);

        restaurants.add(new Restaurant("Mcdonald's",5));
        restaurants.add(new Restaurant("KFC",8));

        TreeSet <Restaurant> inOrder = new TreeSet <Restaurant> (restaurants);

        System.out.println("Restaurants: ");


        for(Restaurant restaurant: inOrder) {
            System.out.println("Name: " + restaurant.getName() +"\n" +"Score: "+ restaurant.getScore() );
        }

    }
}

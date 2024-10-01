package Nivel2_2;
import java.util.*;

public class Restaurant implements Comparable<Restaurant> {  //we can compare thanks to the comparable
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    @Override //making sure the content doesn't repeat
    public int hashCode() {
        return Objects.hash(name,score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant restaurant = (Restaurant) obj;
        return score == restaurant.score && name.equals(restaurant.name);
    }

    @Override
    public int compareTo(Restaurant other) {
        if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        } else {
            return Integer.compare(this.score, other.score);
        }
    }

    public String toString () {
        return "Name: " + this.name +"\n" + "Score: " + this.score;
    }
}

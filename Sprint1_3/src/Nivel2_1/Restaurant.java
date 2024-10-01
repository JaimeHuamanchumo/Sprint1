package Nivel2_1;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant (String name, int score) {
        this.name = name;
        this.score = score;
    }


    @Override //making sure the content doesn't repeat
    public int hashCode() {
        return name.hashCode() + score;
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

    public String toString () {
        return "Restaurant name:  " +name +"\n" + "Score: " + score;
    }

}

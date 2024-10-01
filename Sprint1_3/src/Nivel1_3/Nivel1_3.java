package Nivel1_3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class Nivel1_3 {
    public static void main(String[] args) {

        startGame(List());
    }
    public static HashMap<String, String> List(){

        HashMap<String, String> countries = new HashMap<>();

        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader("countries.txt"))) {
            while ((line = reader.readLine()) != null) {
                String[] twoKeys = line.split(" ", 2);
                if (twoKeys.length > 1) {
                    String key = twoKeys[0].replace("_", " ");
                    String value = twoKeys[1].replace("_", " ");
                    countries.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());

        }
        return countries;
    }
    public static void startGame(HashMap<String, String> countries ){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = sc.nextLine();

        System.out.println( "Try to guess the countries capitals, everytime you get a correct answer you will earn 1 point, \n" +
                "everything will be done in english");

        int pointCounter = 0;
        for (int i = 0; i < 10; i++){

            int randomNum = (int) (Math.random() * countries.size());
            String country = (String) countries.keySet().toArray()[randomNum];
            String capital = countries.get(country);
            System.out.println(country);
            String userResponse = sc.nextLine();

            if (userResponse.equalsIgnoreCase(countries.get(country))){
                System.out.println("Correct, 1 point");
                pointCounter++;
            } else {
                System.out.println("Incorrect");
            }
        }
        SavePlayerData(name, pointCounter);
    }


    public static void SavePlayerData(String playerName, int pointCounter) {
        try (FileWriter playerData = new FileWriter("Results.txt", true)){
            String info = "PLayer : " + playerName + " - Score: " + pointCounter;
            playerData.write(info);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

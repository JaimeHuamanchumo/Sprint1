package Nivel1_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Months {
    private static ArrayList<Month> months;
    private static HashSet<Month> monthHashSet;

    public Months(){
        months = new ArrayList<Month>();
        monthHashSet = new HashSet<Month>();
    }

    public void addMonth(Month month){
        months.add(month);
    }

    public void addMonthSet(Month month, int index){
        if (index > months.size() || index < 0){
            System.out.println("Can't add at this index, is out of bounds");
        } else {
            months.add(index,month);

        }
    }

    public void ArrayToHash(){
        monthHashSet = new HashSet<Month>(months);

    }

    public static void printArrayList() {
        System.out.println("List ordered:");
        for (Month months : months) {
            System.out.println(months.getName());
        }
    }

    public static void printSetList() {
        System.out.println("Unordered but not repeated list");
        for (Month months : monthHashSet) {
            System.out.println(months.getName());
        }
    }

}



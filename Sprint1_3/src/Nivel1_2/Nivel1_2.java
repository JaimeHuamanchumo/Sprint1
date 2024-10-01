package Nivel1_2;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Nivel1_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> revList = new ArrayList<>();

        list.add(45);
        list.add(223);
        list.add(33);

        System.out.println("List normal order" + list);

        revList = list.reversed();
        System.out.println("List in reversed order: " + revList );

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasPrevious()) {
            int ref = listIterator.previous();
            revList.add(ref);
        }
        System.out.println("Using the iterator: " + revList);
    }
}


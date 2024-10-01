package Nivel1_1;

public class Nivel1_1 {
    public static void main(String[] args) {

        Month january = new Month("january");
        Month february = new Month("february");
        Month march = new Month("march");
        Month april = new Month("april");
        Month may = new Month("may");
        Month june = new Month("june");
        Month july = new Month("july");
        Month september = new Month("september");
        Month october = new Month("october");
        Month november = new Month("november");
        Month december = new Month("december");

        Months months = new Months();

        months.addMonth(january);
        months.addMonth(february);
        months.addMonth(march);
        months.addMonth(april);
        months.addMonth(may);
        months.addMonth(june);
        months.addMonth(july);
        months.addMonth(september);
        months.addMonth(october);
        months.addMonth(november);
        months.addMonth(december);



    }
}

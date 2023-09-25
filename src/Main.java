public class Main {
    public static void main(String[] args) {
       for (int q = 1; q <= 10; q++)
           System.out.println(q);

        for (int w = 10; w >= 1; w--)
            System.out.println(w);

        for (int e = 0; e <= 17; e = e + 2)
            System.out.println(e);

        for (int r = 10; r >= -10; r--)
            System.out.println(r);

        for (int a = 1904; a <= 2096; a = a + 4)
            System.out.println( a + " год являеться високостным.");

        for (int s = 7; s <= 98; s = s + 7)
            System.out.println(s);

        for (int q = 1; q <= 512; q = q * 2)
            System.out.println(q);

        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ": сумма накоплений равна  " + total1 + " рублей.");
        }


        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++)
        {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + i + ": сумма накоплений равна  " + total1 + " рублей.");
        }

        int figure;
        for (int i = 1; i <= 10; i++)
        {
            figure = i * 2;
        System.out.println("2 * " + i + " = " + figure);
        }




    }
}
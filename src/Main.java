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


        int deposition = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_450_000) {
            total = total + total/100;
            total = total + deposition;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number >=1; number = number - 1) {
            System.out.print(number + " ");
        }

        int Y = 12_000_000;
        int birth;
        int mortality;
        for (int i = 0; i <= 10; i++) {
            birth = (Y / 1000) * 17;
            mortality = (Y / 1000) * 8;
            Y = (Y + birth) - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + Y);
        }

        int contribution = 15_000;
        int score = 0;
        int month1 = 0;
        do {
            month1 = month1 + 1;
            score = score + ((score * 7) / 100);
            score = score + contribution;
            if (month1 %6 == 0){
            System.out.println("Месяц: " + month1 + ", нынешняя сумма на накопительном счёте " + score);
        }
        }
        while (score < 12_000_000);

        do {
            month1 = month1 + 1;
            score = score + ((score * 7) / 100);
            score = score + contribution;
            if (month1 %6 == 0){
                System.out.println("Месяц: " + month1 + ", нынешняя сумма на накопительном счёте " + score);
            }
        }
        while (month1 < 108);

        int friday = 2;
        int day = 0;
        do {
            friday= friday + 1;
            day = day + 1;
            if (day %7 == 0){
                System.out.println(friday);
            }
        }
        while (day < 31);


        int years = 1817;
        int yearsPresent = 2054;
        while (years < yearsPresent) {
            years = years + 79;
            System.out.println(years);
        }
                
    }
}
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");

        //ДЗ1 задание1
        System.out.println("Задание 1 :");
        int salary = 29000;
        int total =  0;
        int i = 1;
        while ( total <= 2_459_000 ){
            total = total + total/100;
            total = total + ( salary - 14000 );
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //задание 2
        System.out.println("Задание 2:");
        int a = 1;
        while ( a <=10 ){
            System.out.print(a);
            a++;
        }
        System.out.println(" ");
        for (int b = 10; b >= 1; b--){
            System.out.print(b);

        }
        //Задание 3
        System.out.println("Задание 3:");
        int populationY = 12_000_000;
        int birth = 17;
        int death = 8;
        int numbPopulation = 0;
        int allBirthYear = populationY/1000 * birth - populationY/1000 * death;
        System.out.println(allBirthYear);
        for (int y = 1; y <= 10; y++){
            numbPopulation = numbPopulation + allBirthYear + populationY;
            System.out.println("Год " + y + " Численность населения составляет " + numbPopulation );

        }
        //ДЗ-2 Задание1,2 и 3
        System.out.println("Задание 1, 2 и 3 ");
        int sumDeposit = 15000;
        int month = 1;
        for (; month <= 12 * 9 ; month++){
            sumDeposit += sumDeposit * 0.07;

            if (month % 6 == 0 ){
                System.out.println("Кол-во месяцев " + month + " промежуточная сумма " + sumDeposit);
            }

        }
        //Задание 4
         System.out.println("Задание 4 ");
        int firstFriday = 1;

        for (int f = firstFriday ; f <= 31; f= f + 7){
            System.out.printf("Сегодня пятница %s-е число. Необходимо подготовить отчет \n ", f);
        }

        //ДЗ-3 Задание 1
        System.out.println("Задание 1 :");
        int firstYear = 0 ;
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while (firstYear <= finishYear){
            if(firstYear >= startYear){
                System.out.println(firstYear);
            }
            firstYear = firstYear + period;
        }

        //Задание 2
        System.out.println("Задание 2 :");
        int two = 2;
        int productOfNumbers = 0;
        for (int t = 1; t <= 10; t++ ){
            productOfNumbers =  two * t;
            System.out.println(two + "*" + t + "=" + productOfNumbers);

        }










    }
}
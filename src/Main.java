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


    }
}
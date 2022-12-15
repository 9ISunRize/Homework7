public class Main {
    public static void main(String[] args) {

        System.out.println("         ");
        System.out.println("Задача  1 ");
        int selery = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + selery;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }


        System.out.println("         ");
        System.out.println("Задача  2 ");
        int lin1 =0;
        while  (lin1<+10) {
        lin1++;
            System.out.print ( lin1+" ");
        }
        System.out.println("         ");
        int  lin2=11;
        while ( lin2>1 ) {
        lin2--;
            System.out.print ( lin2+" ");
        }


        System.out.println("         ");
        System.out.println("         ");
        System.out.println("Задача 3 ");
        int city = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born-death;
        int Year = 0;
        while ( Year < 10 ) {
            Year++;
            city += city*dif/1000;
            System.out.println ("Год "+Year+", численность населения составляет " +city);
        }


        System.out.println("         ");
        System.out.println("Задача 4 ");
        int amount = 15000;
        int month = 0;
        while ( amount < 12_000_000 ) {
            amount = amount + amount/100*7;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей");

        }


        System.out.println("         ");
        System.out.println("Задача 5 и 6 ");
        int amount2 = 15000;
        int month2 = 0;
        for ( month2 = 0; month2 < 108; month2++) {
            amount2 = amount2 + amount2 / 100 * 7;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " , сумма накоплений равна " + amount2 + " рублей");
            }
        }


        System.out.println("         ");
        System.out.println("Задача 7 ");
        int FirstFridayOfTheMonth = 7;
        while (FirstFridayOfTheMonth<=31) {
            System.out.println("Сегодня пятница, "+FirstFridayOfTheMonth+" -е число. Необходимо подготовить отчет");
            FirstFridayOfTheMonth = FirstFridayOfTheMonth + 7;
        }


        System.out.println("         ");
        System.out.println("Задача 8 ");
        int comeTrajectory = 79;
        for ( int year1 = 1822; year1 <= 2122; year1++) {
            if (year1 % comeTrajectory == 0) {
                System.out.println(year1);
            }
        }


        System.out.println("         ");
        System.out.println("Задача 9 ");
        int theFirstMultiplier =2;
        int multiplier2 =1;
        int composition=0;
        int S = 0;
        while ( S<10 ){
            S++;
            composition= theFirstMultiplier* multiplier2;
            System.out.println(theFirstMultiplier+"*"+ multiplier2+"="+composition);
            multiplier2= multiplier2+1;
        }
    }
}
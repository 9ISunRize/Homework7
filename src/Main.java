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
        var I=0;
        while (I<+10 ) {
            I++;
            System.out.print (I+" ");
        }
        System.out.println("         ");
        var R=11;
        while (R>1 ) {
            R--;
            System.out.print (R+" ");
        }


        System.out.println("         ");
        System.out.println("         ");
        System.out.println("Задача 3 ");
        int Y = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born-death;
        int l = 0;
        while ( l < 10 ) {
            l++;
            Y += Y*dif/1000;
            System.out.println ("Год "+l+", численность населения составляет " +Y);
        }


        System.out.println("         ");
        System.out.println("Задача 4 ");
        int amount = 15000;
        var month = 0;
        while ( amount < 12_000_000 ) {
            amount = amount + amount/100*7;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + amount + " рублей");

        }


        System.out.println("         ");
        System.out.println("Задача 5 и 6 ");
        int amount2 = 15000;
        var month2 = 0;
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
        int TheYearOfTheComet1 = 1817;
        int p = 0;
        while ( p<3 ){
            p++;
            TheYearOfTheComet1 = TheYearOfTheComet1+79;
            System.out.println(TheYearOfTheComet1);
        }



        System.out.println("         ");
        System.out.println("Задача 9 ");
        int P=2;
        int m=1;
        int PR=0;
        int S = 0;
        while ( S<10 ){
            S++;
            PR= P*m;
            System.out.println(P+"*"+m+"="+PR);
            m=m+1;
        }
    }
}
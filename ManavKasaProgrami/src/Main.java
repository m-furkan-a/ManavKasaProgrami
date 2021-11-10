import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5 , toplam;
        int a,e,d,m,p;
        System.out.println("armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlıcan = 5");
        System.out.print("Armut Kaç Kilo = ");
        a = input.nextInt();
        toplam =a*armut;
        System.out.print("Elma Kaç Kilo = ");
        e = input.nextInt();
        toplam +=e*elma;
        System.out.print("Domates Kaç Kilo = ");
        d = input.nextInt();
        toplam +=d*domates;
        System.out.print("Muz Kaç Kilo = ");
        m = input.nextInt();
        toplam +=m*muz;
        System.out.print("Patlıcan Kaç Kilo = ");
        p = input.nextInt();
        toplam +=p*patlıcan;
        System.out.print("Toplam Tutar : " + toplam);
    }
}

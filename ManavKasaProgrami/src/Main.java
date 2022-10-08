import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total,armut,elma,domates,muz,patlican,armutKgFyt = 2.14,elmaKgFyt = 3.67,domatesKgFyt = 1.11,muzKgFyt = 0.95,patlicanKgFyt = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = scanner.nextDouble();

        total = (armut * armutKgFyt) + (elma * elmaKgFyt) + (domates * domatesKgFyt) + (muz * muzKgFyt) + (patlican * patlicanKgFyt);
        System.out.println("Toplam Fiyat : " + total);

    }
}
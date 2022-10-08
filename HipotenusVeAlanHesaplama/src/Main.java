import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan dik kenar uzunlukları alınarak "HİPOTENÜS" hesaplama.....
        /*System.out.print("Kenar 1 : ");
        a = scanner.nextInt();
        System.out.print("Kenar 2 : ");
        b = scanner.nextInt();
        c = (a * a) + (b * b);
        System.out.println("Hipotenüs : " + Math.sqrt(c));*/

        //Üç kenar uzunluğunu kullanıcıdan alınarak "Üçgenin Alanı" hesaplama...
        System.out.print("Kenar 1 : ");
        a = scanner.nextInt();
        System.out.print("Kenar 2 : ");
        b = scanner.nextInt();
        System.out.print("Kenar 3 : ");
        c = scanner.nextInt();
        double u = (a+b+c) / 2.0;
        double alan = Math.sqrt(u * (u - a ) * (u - b ) * (u - c ));
        System.out.println("Üçgenin Alanı : " + alan);






    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        int toplam = 0;
        //Scanner sınıfını tanımladık.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = scanner.nextInt();

        if(0 <= mat && mat <=100){
            toplam += mat;
        }else {
            toplam =0;
        }
        if(0 <= fizik && fizik <=100){
            toplam += fizik;
        }else {
            toplam =0;
        }
        if(0 <= kimya && kimya <=100){
            toplam += kimya;
        }else {
            toplam =0;
        }
        if(0 <= turkce && turkce <=100){
            toplam += turkce;
        }else {
            toplam =0;
        }
        if(0 <= muzik && muzik <=100){
            toplam += muzik;
        }else {
            toplam =0;
        }


        int sonuc = toplam / 5;

        System.out.println("Ortalamanız : " + sonuc);
        if(sonuc < 55){
            System.out.println("Kaldınız...");
        }else {
            System.out.println("Geçtiniz...");
        }
    }
}
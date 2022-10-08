import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/

        //Değişkenleri oluştur.
        double mat,fizik,kimya,tarih,turkce,muzik;

        //Scanner sınıfını tanımladık.
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextDouble();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextDouble();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextDouble();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextDouble();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextDouble();


        double toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : " + sonuc);

        /* Ödev : Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının
        ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        ****Not : If ve Else kullanılmayacak**** */

        String durum = sonuc >= 60 ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(durum);


    }
}
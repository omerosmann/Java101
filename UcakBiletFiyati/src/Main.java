import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi,indirimliUcret,yeniUcret,yasIndirimi,biletIndirimi;
        double kmUcreti = 0.10,kucukYas = 0.50,gencYas = 0.10,yasliYas =0.30,gidisDonusIndirimi = 0.20,total;
        String tekYon = "1";
        String ciftYon = "2";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz :");
        mesafe = scanner.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini seçiniz : "+ (tekYon) + " -> " + "(Tek yön gidiş)" + " " + ciftYon + " -> " +  "(Çift yön gidiş) :");
        yolculukTipi = scanner.nextInt();

        if(mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)){
            if(yas < 12){
                yeniUcret = (int) (mesafe * kmUcreti);
                yasIndirimi = (int) (yeniUcret * kucukYas);
                indirimliUcret = yeniUcret - yasIndirimi;
                if(yolculukTipi == 2){
                    biletIndirimi = (int) (indirimliUcret * gidisDonusIndirimi);
                    total = (indirimliUcret - biletIndirimi) * 2;
                    System.out.println("Toplam tutar : " + total);
                }else{
                    System.out.println("Toplam tutar : " + indirimliUcret);
                }
            } else if (yas > 12 && yas < 24) {
                yeniUcret = (int) (mesafe * kmUcreti);
                yasIndirimi = (int) (yeniUcret * gencYas);
                indirimliUcret = yeniUcret - yasIndirimi;
                if(yolculukTipi == 2){
                    biletIndirimi = (int) (indirimliUcret * gidisDonusIndirimi);
                    total = (indirimliUcret - biletIndirimi) * 2;
                    System.out.println("Toplam tutar : " + total);
                }else{
                    System.out.println("Toplam tutar : " + indirimliUcret);
                }
            }else if(yas > 65){
                yeniUcret = (int) (mesafe * kmUcreti);
                yasIndirimi = (int) (yeniUcret * yasliYas);
                indirimliUcret = yeniUcret - yasIndirimi;
                if(yolculukTipi == 2){
                    biletIndirimi = (int) (indirimliUcret * gidisDonusIndirimi);
                    total = (indirimliUcret - biletIndirimi) * 2;
                    System.out.println("Toplam tutar : " + total);
                }else{
                    System.out.println("Toplam tutar : " + indirimliUcret);
                }
            }else {
                yeniUcret = (int) (mesafe * kmUcreti);
                if(yolculukTipi == 2){
                    biletIndirimi = (int) (yeniUcret * gidisDonusIndirimi);
                    total = (yeniUcret - biletIndirimi) * 2;
                    System.out.println("Toplam tutar : " + total);
                }else{
                    System.out.println("Toplam tutar : " + yeniUcret);
                }
            }

        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }














    }
}
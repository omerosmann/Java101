import java.util.Scanner;

public class Main {


    static void desen(int sayi, int sonuc, int geciciSayi){
        if(geciciSayi <= 0){
            System.out.println(sonuc + " ");
            sonuc += 5;
            if(sonuc == sayi){
                System.out.println(sonuc + " ");
                return;
            }
        }else if(geciciSayi > 0){
            System.out.println(sonuc + " ");
            sonuc -= 5;
            if (sonuc <= 0){
                geciciSayi = sonuc;
            }
        }
        desen(sayi,sonuc,geciciSayi);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = scanner.nextInt();
        int sonuc = sayi;
        int geciciSayi = sayi;

        if(sayi == 0){
            System.out.println("Sıfır kullanılamaz.");
        }else{
            desen(sayi,sonuc,geciciSayi);
        }



    }
}
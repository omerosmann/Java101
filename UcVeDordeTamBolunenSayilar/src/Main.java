import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ortalama,toplam = 0,sayiAdedi = 0;

        while (true){
            System.out.print("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();

            if(sayi == 0){
                break;
            }
            else if(sayi % 3 == 0 && sayi % 4 == 0){
                toplam += sayi;
                sayiAdedi++;

            }
        }
        ortalama = toplam / sayiAdedi;

        System.out.println("3 ve 4'e tam bölünen sayıların toplamı : " + toplam);
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}
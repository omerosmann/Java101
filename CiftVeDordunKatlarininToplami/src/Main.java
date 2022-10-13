import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true){
            System.out.print("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();

            if(sayi % 2 == 0){
                toplam += sayi;
            }
            else {
                break;
            }
        }

        System.out.println("Çift ve 4'e tam bölünen sayıların toplamı : " + toplam);

    }
}
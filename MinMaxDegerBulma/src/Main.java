import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç değer giriceksiniz : ");
        int deger = scanner.nextInt();
        int min = 1, max = 1;

        for (int i = 1; i <= deger; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int sayi = scanner.nextInt();

            if (i == 1){
                max = sayi;
                min = sayi;
            }

            if (sayi > max){
                max = sayi;
            }

            if (sayi < min){
                min = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }

}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : " );
        int sayi = scanner.nextInt();

        int[] list = {2,7,11,-1,35,26,13};

        int min = list[0];
        int max = list[0];

        Arrays.sort(list);
        for (int i : list) {
            if (i < sayi) {
                min = i;

            }
            if (i > sayi) {
                max = i;
                break;
            }
        }

        System.out.println("Minimum En Yakın Değer " + min);
        System.out.println("Maximum En Yakın Değer " + max);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        sayi = scanner.nextInt();

        for(int i = 0; i <= sayi; i++){
            if(i % 4 == 0 && i % 5 ==0){
                System.out.println(i);
            }
        }

    }
}
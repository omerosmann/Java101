import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);


        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5){
            System.out.print("Lütfen  tahmininizi giriniz : ");
            selected = scanner.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arası bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler doğru tahmin. Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            }else {

                System.out.println("Hatalı bir sayı girdiniz !");
                if(selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }


                System.out.println("Kalan hakkınız : " + (5 - right));
            }
            wrong[right++] = selected;
        }
        if(!isWin){
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }



    }
}
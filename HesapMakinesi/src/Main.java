import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,select;

        Scanner scanner = new Scanner(System.in);


        String islemler = "1 - Toplama\n"
                         +"2 - Çıkarma\n"
                         +"3 - Çarpma\n"
                         +"4 - Bölme";
        System.out.println(islemler);
        System.out.print("İşlem Seçiniz : ");
        select = scanner.nextInt();
        System.out.print("İlk Sayıyı Giriniz : ");
        a = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = scanner.nextInt();

        switch (select){
            case 1 :
                System.out.println(a + b);
                break;
            case 2 :
                System.out.println(a - b);
                break;
            case 3 :
                System.out.println(a * b);
                break;
            case 4 :
                if(b != 0){
                    System.out.println(a / b);
                }else{
                    System.out.println("Bir sayı 0'a bölünemez...");
                }
                break;
            default:
                System.out.println("Geçersiz işlem...");
        }










    }
}
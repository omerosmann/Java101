import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık Kaç Derece : ");
        int heat = scanner.nextInt();

        String islemler = "Girilen sıcaklık aralığı seçiniz\n"+
                        "1 - 5 > heat\n" +
                        "2 - 5 < heat < 15\n"+
                        "3 - 15 < heat < 25\n"+
                        "4 - 25 < heat";
        Scanner sc = new Scanner(System.in);
        System.out.println(islemler);
        System.out.print("İşlem seçiniz : ");
        int islem = scanner.nextInt();

        switch (islem){
            case 1 :
                System.out.println("Kayak yapabilirsiniz...");
                break;
            case 2 :
                System.out.println("Sinemaya gidebilirsiniz...");
                break;
            case 3 :
                System.out.println("Piknik yapabilirsiniz...");
                break;
            case 4 :
                System.out.println("Yüzmeye gidebilirsiniz...");
                break;
            default:
            {
                System.out.println("Geçersiz işlem...");
            }




        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day,month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = scanner.nextInt();
        System.out.print("Doğduğunuz gün :");
        day = scanner.nextInt();

        if(month == 1){
            if(1 <= day && day < 22){
                System.out.println("Burcunuz Oğlak");
            } else if (day >=  22 && day <= 31 ) {
                System.out.println("Burcunuz Kova");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        } else if (month == 2) {
            if(1 <= day && day <= 19){
                System.out.println("Burcunuz Kova");
            } else if (day >=  20 && day <= 29 ) {
                System.out.println("Burcunuz Balık");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 3) {
            if(1 <= day && day <= 20){
                System.out.println("Burcunuz Balık");
            } else if (day >=  21 && day <= 31 ) {
                System.out.println("Burcunuz Koç");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 4) {
            if(1 <= day && day <= 20){
                System.out.println("Burcunuz Koç");
            } else if (day >=  21 && day <= 30 ) {
                System.out.println("Burcunuz Boğa");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 5) {
            if(1 <= day && day <= 21){
                System.out.println("Burcunuz Boğa");
            } else if (day >=  22 && day <= 31 ) {
                System.out.println("Burcunuz İkizler");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 6) {
            if(1 <= day && day <= 22){
                System.out.println("Burcunuz İkizler");
            } else if (day >=  23 && day <= 30 ) {
                System.out.println("Burcunuz Yengeç");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 7) {
            if(1 <= day && day <= 22){
                System.out.println("Burcunuz Yengeç");
            } else if (day >=  23 && day <= 31 ) {
                System.out.println("Burcunuz Aslan");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 8) {
            if(1 <= day && day <= 22){
                System.out.println("Burcunuz Aslan");
            } else if (day >=  23 && day <= 31 ) {
                System.out.println("Burcunuz Başak");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 9) {
            if(1 <= day && day <= 22){
                System.out.println("Burcunuz Başak");
            } else if (day >=  23 && day <= 30 ) {
                System.out.println("Burcunuz Terazi");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 10) {
            if(1 <= day && day <= 22){
                System.out.println("Burcunuz Terazi");
            } else if (day >=  23 && day <= 31 ) {
                System.out.println("Burcunuz Akrep");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 11) {
            if(1 <= day && day <= 21){
                System.out.println("Burcunuz Akrep");
            } else if (day >=  22 && day <= 30 ) {
                System.out.println("Burcunuz Yay");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 12) {
            if(1 <= day && day <= 21){
                System.out.println("Burcunuz Yay");
            } else if (day >=  22 && day <= 31 ) {
                System.out.println("Burcunuz Oğlak");
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }

    }
}
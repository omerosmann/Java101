import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kullanicininAdi = "patika";
        String kullanicininSifresi = "1234";
        String sifre;
        String yeniSifre;
        int evet = 1;
        int hayir = 2;
        int select;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı :");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre :");
        sifre = scanner.nextLine();

        if(kullanicininSifresi.equals(sifre)){
            System.out.println("Hoşgeldiniz...");

        }else {
            System.out.println("Şifreniz hatalı");
            System.out.println("Şifreniniz değiştirmek ister misiniz ?\n"
                                +"EVET ise : 1\n"
                                +"HAYIR ise : 2");
        }

        select = scanner.nextInt();

         switch (select){
             case 1:
                System.out.print("Yeni şifrenizi giriniz :");
                Scanner sc = new Scanner(System.in);
                yeniSifre = sc.nextLine();

                if (kullanicininSifresi.equals(yeniSifre) || sifre.equals(yeniSifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    break;

                }else {

                    System.out.println("Yeni şifreniz oluşturuldu.");
                }
                break;

             case 2:
                System.out.println("Şifrenizi değiştirmek istemediniz...");
                break;

             default:
                System.out.println("Geçersiz işlem...");
        }



    }
}

/*
        Scanner doldur = new Scanner(System.in);
        yap = doldur.nextInt();
        System.out.println(yap);

        if (yap == dogru) {
            System.out.println("sifreniz dogru");
        } else if (yap != dogru) {

            System.out.println("sifreniz yanlış sıfırlamak ister misiniz?\n Evet ise 1 e hayır ise 2 ye basın");
            int a = 1, b = 2, zero;

            Scanner sıfırlama = new Scanner(System.in);
            zero = sıfırlama.nextInt();

            if(zero==1){
                int olustur;
                System.out.println("yeni sifrenizi giriniz: ");
                Scanner input = new Scanner(System.in);
                olustur= input.nextInt();
                System.out.println(olustur);
                if(olustur==yap){
                    System.out.println("aynısını yazdın başka şifre gir");
                }
                if(olustur!=yap){
                    System.out.println("başarıyla yeni şifre oluşturdunuz");

                }
            }

            else{
                System.out.println("şifre oluşturmak istemediniz");
             */
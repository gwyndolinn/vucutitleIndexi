import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenlerimizi tanımlayalım
        double kilo, boy, vucutKitleIndexi;

         //Kullanıcıdan verileri alalım
        Scanner inp = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo = inp.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        vucutKitleIndexi = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: "+ vucutKitleIndexi );
    }
}
//Kullanıcıdan veri almak için scanner sınıfı oluşturuldu.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan verilerin alınması
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        int c = input.nextInt();

        // İşlem sırasına göre işlemlerin yapılması
        int conclusion = (a + b) * c - b;

        System.out.println("İşlem sonucu: " + conclusion);

    }

}
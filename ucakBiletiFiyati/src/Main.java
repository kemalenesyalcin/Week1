import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alma
        System.out.print("Mesafeyi km olarak giriniz");
        int distance = inp.nextInt();

        System.out.print("yaşınızı giriniz");
        int age = inp.nextInt();

        System.out.print("Yolculuk tipi giriniz 1-Tek yön yada 2-gidiş dönüş");
        int chose = inp.nextInt();

        if (distance <= 0 || age <= 0 || chose != 1 && chose != 2) {
            System.out.print("Lütfen geçerli bir değer giriniz");
        }
        double price = distance * 0.10;

        if (age < 12) {
            price *= 0.5;
        } else if (age > 12 && age < 24) {
            price *= 0.9;
        } else if (age > 65) {
            price *= 0.7;
        }
        if (chose == 2) {
            price *= 0.8;
        }
        System.out.print("toplam tutarınız:" + price + "TL");

    }
}
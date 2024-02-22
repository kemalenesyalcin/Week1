import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan gireceği sayı adetini öğrenme
        System.out.println("Kaç tane sayı gireceksiniz?");
        int n = inp.nextInt();

        // İlk yazılan sayıyı en büyük ve en küçük sayı olarak atama
        System.out.println("1. sayıyı giriniz:");
        int max = inp.nextInt();
        int min = max;

        // Girilen diğer sayıların durumunu kontrol etme
        for (int i = 2; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz:");
            int num = inp.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // En büyük ve küçük sayıyı yazdırma
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}

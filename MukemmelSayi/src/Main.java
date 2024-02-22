import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = inp.nextInt();

        int sum = 0;
        // Girilen sayının çarpanlarını bulma ve toplama
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Mükemmel sayı kontrolü
        if (sum == num) {
            System.out.println(num + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(num + " Mükemmel bir sayı değildir.");
        }

    }
}

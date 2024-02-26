import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divisor) {
        if (divisor == 1) return true;
        if (number <= 1) return false;
        if (number % divisor==0) return false;
        return isPrime(number, divisor - 1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        if (isPrime(number,number-1)) System.out.print(" sayısı ASAL'dır!");
        else System.out.print(" sayısı ASAL değildir");

    }

}
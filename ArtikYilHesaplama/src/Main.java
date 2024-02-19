import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir yıl giriniz");
        int year = inp.nextInt();

        if (year < 1) {
            System.out.print("Lütfen geçerli bir yıl giriniz");
        } else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.print(year + "Artık bir yıldır");
        } else {
            System.out.print(year + "Artık bir yıl değildir");
        }

    }
}
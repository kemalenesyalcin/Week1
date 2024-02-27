import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static int pattern(int firstNumber, int temp, boolean check) {

        if (firstNumber > 0 && check == true) {
            System.out.print(firstNumber + " ");
            return pattern(firstNumber - 5, temp, check);

        } else {
            System.out.print(firstNumber + " ");
            check = false;
            if (firstNumber == temp) {
                return firstNumber;
            }
            return pattern(firstNumber + 5, temp, check);
        }
    }

    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int firstNumber = inp.nextInt();
        boolean check = true;
        int temp = firstNumber;
        pattern(firstNumber, temp, check);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //fibonacci 0 1 seklinde başladığı için döngüde kullanmak için onları birer değişkene atadık
        int n1 = 0;
        int n2 = 1;
        int total = 0;

        //Kullanıcıdan seri sayısı bilgisi alma
        System.out.print("Kaç elemanlı fibonacci serisi yapmak istersiniz ?");
        int time = inp.nextInt();

        System.out.println(time + " sayılı fibonacci serisi");

        //döngünün kaç kere tekrar edeceğini bildiğimiz için for döngüsü kullanıldı.
        for (int i = 1; i <= time; i++) {
            System.out.print(n1 + ",");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }


    }
}
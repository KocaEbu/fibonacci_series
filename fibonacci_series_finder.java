import java.util.Scanner;


public class fibonacci_series_finder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3, count;
        System.out.print("Seride kac eleman gormek istediginizi giriniz : ");
        count = input.nextInt();

        for (int i = 2; i <= count; i++) {

            n3 = n1 + n2;

            System.out.println("Ilk 0 ve 1 Sonrasi Toplam = " + n3);
            n1 = n2;
            n2 = n3;

        }



    }
}

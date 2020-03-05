package Unit03;

import java.util.Scanner;

public class ConverterValut {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter summ in dollars:");
            Scanner sc = new Scanner(System.in);

            double a = sc.nextDouble();

            System.out.println("Select the currency you need to convert to:\n" +
                    "1 - EUR; 2 - BYN, 3 - JPY");

            double currency = sc.nextDouble();

            if (currency == 1) {
                System.out.println("Your sum in EUR = " + (a * 0.9));
            } else if (currency == 2) {
                System.out.println("Your sum in BYN = " + (a * 2.23));
            } else if (currency == 3) {
                System.out.println("Your sum in JPY = " + (a * 107.76));
            } else {
                System.out.println("Enter the correct currency number");
            }
        }
    }
}

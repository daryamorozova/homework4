package whileTask;

import java.util.Scanner;

public class WhileSolvers {
    public static void main(String[] args) {
//        factorial();
//        evenNumbers();
        reverseCountNumbers();

    }

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        int result = 1;

        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void evenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void reverseCountNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

package forTask;

import java.util.Scanner;

public class forSolver {
    public static void main(String[] args) {
//        divide3();
//        System.out.println(summOfAllNumbers());
//        multiplyTable();
//        isSimple();
        numbers1to10();
    }



    public static void divide3() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int summOfAllNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= number; i++) {
            sum += i; // sum = sum + i
        }
        return sum;
    }

    public static void multiplyTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i
            );
        }
    }

    public static void isSimple (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Не является простым");
                break;
            } else {
                System.out.println("Простое");
                break;
            }

        }
    }

    public static void numbers1to10(){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

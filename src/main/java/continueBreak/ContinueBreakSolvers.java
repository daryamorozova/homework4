package continueBreak;

import java.util.Scanner;

public class ContinueBreakSolvers {
    public static void main(String[] args) {
//        summ();
//        positiveNumbers();
//        numbersWithout3();
        findStop();
    }

    public static void summ() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0 ) {break;}
            sum += number;
        }

        System.out.println("Сумма введенных положительных чисел " + sum);


    }

    public static void numbersWithout3(){
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

    public static void positiveNumbers(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0 ) {continue;}
            System.out.println(number);
        }
    }

    public static void findStop(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {break;}
            System.out.println(command);
        }
    }

}

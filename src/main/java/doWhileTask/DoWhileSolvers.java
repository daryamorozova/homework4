package doWhileTask;

import java.util.Scanner;

public class DoWhileSolvers {
    public static void main(String[] args) {

//        positiveNumber();
//        checkPassword();
//        numbers1to10();
//        checkCommand();
        countOfDigits();
    }


    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        }
        while (number <= 0);

        System.out.print("Число положительное");
    }

    public static void checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        }
        while (!password.equals("123"));

        System.out.println("Пароль верный");
    }

    public static void numbers1to10(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);
    }

    public static void checkCommand(){
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }
        while (!command.equals("exit"));

        System.out.println("Работа завершена");
    }

    public static void countOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Количество цифр равно 0");
        } else {
            int count = 0;
            do {
                count++;
                number = number / 10;
            }
            while (number > 0);
            System.out.println(count);
        }

    }
}

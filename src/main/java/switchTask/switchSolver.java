package switchTask;

import java.util.Scanner;

public class switchSolver {
    public static void main(String[] args){
//        dayOfWeek();
//        ticketPrice();
//        gradeLetter();
//        textCommand();

        calculate();

    }

    public static void dayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
            default:
                System.out.print("Введен некорректный день недели");
                break;

        }
    }

    public static void ticketPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 5){
            System.out.print("Стоимость билета 300 рублей");}
        else if (number > 5 && number <= 7){
            System.out.print("Стоимость билета 450 рублей");}
        else {
            System.out.print("Введен некорректный день недели");}
        }

    public static void gradeLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов: ");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 100){
            System.out.print("Ваша оценка: А");
        } else if (number >= 80 && number < 90){
            System.out.print("Ваша оценка: В");
        } else if (number >= 70 && number < 80){
            System.out.print("Ваша оценка: С");
        } else if (number >= 60 && number < 70){
            System.out.print("Ваша оценка: D");
        } else if (number < 60 && number >= 0){
            System.out.print("Ваша оценка: F");
        } else {
            System.out.print("Введено некорректное число");
        }

    }

    public static void textCommand(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command){
            case "start":
                System.out.print("Начать");
                break;
            case "stop":
                System.out.print("Остановить");
                break;
            case "restart":
                System.out.print("Перезапуск");
                break;
            case "status":
                System.out.print("Состояние");
                break;
            default:
                System.out.print("Не определено");
                break;
        }
            }

    public static void calculate(){
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = scanner1.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner2.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner3.nextLine();

        switch (operator){
            case "+":
                System.out.print("Сумма: " + (number1 + number2));
                break;
            case "-":
                System.out.print("Разность: " + (number1 - number2));
                break;
            case "*":
                System.out.print("Произведение: " + (number1 * number2));
                break;
            case "/":
                System.out.print("Частное: " + (number1 / number2));
                break;
        }
    }
}

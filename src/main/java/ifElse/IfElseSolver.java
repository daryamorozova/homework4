package ifElse;

import java.util.Scanner;

public class IfElseSolver {
    public static void main(String[] args){
        // проверка знака числа
//        signNumber();

//        maxNumber();
//        grade();
//        evenOrOddNumber();
//        discountAge();
        testResult();

    }

    public static void signNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное");
        } else if (number < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println( "Число равно нулю");
        }
    }

    public static void maxNumber(){
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = scanner1.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner2.nextInt();

        int maxNumber = Math.max(number1, number2);
        System.out.println(maxNumber);
    }

    public static void grade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 1:
                System.out.print("Неудовлетворительно");
                break;
            case 2:
                System.out.print("Неудовлетворительно");
                break;
            case 3:
                System.out.print("Удовлетворительно");
                break;
            case 4:
                System.out.print("Хорошо");
                break;
            case 5:
                System.out.print("Отлично");
                break;
            default:
                System.out.print("Оценка не определена");
                break;
        }
    }

    public static void evenOrOddNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.print("Четное");
        } else {
            System.out.print("Нечетное");
        }
    }

    public static void discountAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.print("Ваша скидка 25%");
        } else if (age >= 65){
            System.out.print("Ваша скидка 30%");
        } else {
            System.out.print("К сожалению, для вас скидка не действует");
        }
    }

    public static void testResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите результат в баллах: ");
        int result = scanner.nextInt();

        if (result >= 90 && result <= 100){
            System.out.print("Отлично");
        } else if (result >= 75 && result <= 89){
            System.out.print("Хорошо");
        } else if (result >= 60 && result <= 74){
            System.out.print("Удовлетворительно");
        } else if (result < 60 && result >= 0){
            System.out.print("Неудовлетворительно");
        } else if (result < 0 || result > 100) {
            System.out.print("Введено некорректное количество баллов");
        }
    }


}

import java.util.Scanner;




public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            if (a > b) {
                System.out.println(a + " > " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);

            } else {
                System.out.println(a + " = " + b);
            }
            int sum = a + b;
            System.out.println("Сумма этих чисел равна: " + sum);
            //Дадим пользователю выбор из какого числа вычитать оставшееся
        while (true) {
            System.out.println("Из какого числа хотите вычесть");
            System.out.println("1 " + a);
            System.out.println("2 " + b);
            int choice1 = scanner.nextInt();

            int result1;
            if (choice1 == 1) {
                result1 = a - b;
                System.out.println("Результат вычитания " + b + " из " + a + " равен " + result1);
                break;
            } else if (choice1 == 2) {
                result1 = b - a;
                System.out.println("Результат вычитания " + a + " из " + b + " равен " + result1);
                break;
            } else {
                System.out.println("Неверный выбор числа для вычитания");
            }
        }
            int mult = a * b;
            System.out.println("Результат умножения этих чисел равен: " + mult);

        //Дадим пользователю выбор из какого числа делить оставшееся
        while (true) {
            System.out.println("Какое число хотите поделить");
            System.out.println("1 " + a);
            System.out.println("2 " + b);
            int choice2 = scanner.nextInt();

            double result2;
            if (choice2 == 1) {
                result2 = (double) a / b;
                System.out.println("Результат деления " + a + " на " + b + " равен " + result2);
                break;
            } else if (choice2 == 2) {
                result2 = (double) b  / a;
                System.out.println("Результат деления  " + b + " на " + a  + " равен " + result2);
                break;
            } else {
                System.out.println("Неверный выбор числа для вычитания");
            }
        }
        scanner.close();
    }
}

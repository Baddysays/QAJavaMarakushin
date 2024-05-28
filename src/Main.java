import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));

        if (b != 0) {
            System.out.println("Частное: " + ((double)a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }

        System.out.println("Произведение: " + (a * b));
    }

}
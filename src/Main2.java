import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку (a):");
        String a = scanner.nextLine();

        System.out.println("Введите вторую строку (b):");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}

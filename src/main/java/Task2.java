import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("x+b=a");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.println("Вы ввели уравнение: " + "x +" + b + "=" + a);
        double x = a - b;
        System.out.println("Результат вычислений: " + x);

    }

}

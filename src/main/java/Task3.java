import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;


public class Task3 {

    public static void main(String[] args) {
        try {
            new Task3().max();
        } catch (IOException ignored) {
        }
    }

    private void max() throws IOException {
        int maxLength = -1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк: ");
        Scanner sc1 = new Scanner(in);
        int n = sc1.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d строку: ", i + 1);
            array[i] = reader.readLine();
            if (array[i].length() > maxLength) maxLength = array[i].length();
        }
        System.out.println("Самая длинная строка:");
        for (String string : array) {
            if (string.length() == maxLength) {
                System.out.println(string);
            }
        }
    }
}







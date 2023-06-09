import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Загадка: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает \" Что это? У тебя 3 попытки.");
        System.out.println("Можешь взять подсказку, написав \"Хочу подсказку!\" Но после этого будет лишь 1 попытка.");

        Scanner inputAnswer = new Scanner(System.in);
        String answer;
        int amount = 0;
        boolean effort;
        String advice = "Подсказка: Почти как ковид, только в архиве. Два слова, используй приставку\"за\" в превом";


        while (amount < 3) {
            answer = inputAnswer.nextLine();
            effort = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Хочу подсказку!")) {
                System.out.println(advice);
                amount = 2;
                System.out.println(amount);
            } else if (effort) {
                System.out.println("Правильно!");
                break;
            } else if (amount < 2) {
                System.out.println("Подумай еще!");
                amount++;
            } else {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}

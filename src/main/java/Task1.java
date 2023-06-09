import org.apache.commons.math3.util.Precision;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        double amount;
        double currencyRate;
        double dollar;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nУкажите курс доллара: ");
        currencyRate = sc.nextFloat();
        System.out.println("Ваша валютная ставка: " + Precision.round(currencyRate,2));

        System.out.println("Укажите количества рублей: ");
        amount = sc.nextFloat();
        System.out.println("Количество рублей, которые вы хотите конвертировать: " + Precision.round(amount,2));

        dollar = Precision.round(amount/currencyRate,2);
        System.out.println(amount + " рублей = " + dollar + " долларам");

    }

}

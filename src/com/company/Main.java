package com.company;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Main {

    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int[] paymentsWeekJournal = {23_888, 37_544, 40_020, 13_463, 80_114};
        int paymentsSum = 0;
        for (int week : paymentsWeekJournal) {
            paymentsSum += week;
        }
        System.out.println("Сумма трат за месяц составила " + paymentsSum + " рублей");
        //task 2
        ///int min = Arrays.stream(paymentsWeekJournal).min().getAsInt();
        ///int max = Arrays.stream(paymentsWeekJournal).max().getAsInt();
        System.out.println("Task 2");
        int[] paymentsWeekJournal1 = {23_888, 37_544, 40_020, 13_463, 80_114};
        int min = paymentsWeekJournal1[0];
        int max = paymentsWeekJournal1[0];
        for (int payments : paymentsWeekJournal1) {
            if (payments < min) {
                min = payments;
            }
            if (payments > max) {
                max = payments;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");
        //task 3
        System.out.println("task 3");
        int [] paymentsWeekJournal3 = {23_888, 37_544, 40_020, 13_463, 80_114};
        double paymentsSummary = 0;
        for (int payments : paymentsWeekJournal3) {
            paymentsSummary += payments;
        }
        System.out.println("Средняя сумма трат за месяц составила " + paymentsSummary/ paymentsWeekJournal3.length + " рублей.");
        //task 4
        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
            System.out.println(Arrays.toString(reverseFullName));
    }

}
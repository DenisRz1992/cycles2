public class Main {
    public static void main(String[] args) {
        System.out.println("cycles2");

        // Условие прошлой задачи

        // int total = 0;
        // int savings = 29000;
        // for (int q = 1;  q <= 12; q++) {
        // total = total + total/100;
        // total = total + savings;
        // System.out.println("месяц " + q + ", сумма накоплений равна " + total + " рублей");}

        // Задача 1

        int total = 0;
        int month = 1;
        int postpone = 15000;
        int necessary = 2459000;
        while (total <= necessary) {
            total = total + total / 100;
            total = total + postpone;
            {
                System.out.println("месяц " + month + ", сумма накоплений равна " + total + " рублей");
                month++;
                if (total >= necessary) {
                    break;
                }
            }
        }

        // Задача 2

        int number = 0;
        while (number < 10) {
            number++;
            {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 3

        int y = 12000000;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * y / 1000;
            int mortality = 8 * y / 1000;
            y = y + birthRate - mortality;
            System.out.println("год " + i + ", численность населения составляет " + y);
        }

        // Задача 4

        int sum = 15000;
        int monthSum = 1;
        while (sum <= 12000000) {
            sum *= 1.07;
            System.out.println("месяц " + monthSum + ", сумма накоплений " + sum);
            monthSum++;
        }

        // Задача 5

        int sum1 = 15000;
        int monthSum1 = 1;
        while (sum1 <= 12000000) {
            sum1 *= 1.07;
            if (monthSum1 % 6 == 0) {
                System.out.println(" месяц " + monthSum1 + ", сумма накоплений " + sum1);
            }
            monthSum1++;
        }

        // Задача 6


        int sum2 = 15000;
        for (int i = 0; i < 9 * 12; i = i + 6) {
            int sumBefore = sum2;
            sum2 *= 1 + 0.07 * 6;
            int sum3 = sum2 - sumBefore;
            System.out.println ("месяц " + i + " сумма накоплений " + sum3);
        }

        //  Задача 7

        int number1 = 1;
        for (int friday = number1; friday <=31; friday +=7) {
            System.out.println("сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        // Задача 8

        int year = 2023;
        int lastYears = year - 200;
        int futureYears = year + 100;
        for ( int i = lastYears; i < futureYears; i++) {
            if (i % 79 ==0) {
                System.out.println(i);
            }
        }
    }
    }
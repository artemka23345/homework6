public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        int moneyBox = 0;
        int deposit = 15000;
        int months = 0;
        String msg = "Месяц %d, сумма накоплений равна %d рублей \n";
        while (moneyBox < 2_459_000) {
            moneyBox = moneyBox + moneyBox / 100;
            moneyBox = moneyBox + deposit;
            months++;
            System.out.printf(msg, months, moneyBox);
        }

    }

    public static void task2() {
        int i = 1;
        for (; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        while (i > 1) {
            i--;
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {

        int populationY = 12_000_000;
        int birthRate = 0;
        int mortality = 8;
        String msg = "Год %d, численность населения составляет %d.\n";
        for (int i = 1; i <= 10; i++) {
            birthRate = populationY / 1000 * 17;
            populationY = populationY + birthRate - mortality;
            System.out.printf(msg, i, populationY);
        }
    }

    public static void task4() {
        double deposit = 15_000;
        int limit = 12_000_000;
        int months = 0;
        double money = 0;
        String msg = "%d месяц, %.2f\n";
        while (money < limit) {
            money = money + money * 0.07;
            money = deposit + money;
            months++;
            System.out.printf(msg, months, money);
        }
    }

    public static void task5() {
        double deposit = 15_000;
        int limit = 12_000_000;
        int months = 0;
        double money = 0;
        String msg = "%d месяц, %.2f\n";
        while (money < limit) {
            money = money + money * 0.07;
            money = deposit + money;
            months++;
            if (months % 6 == 0) {
                System.out.printf(msg, months, money);
            }
        }
    }

    public static void task6() {
        double deposit = 15_000;
        int ageLimit = 9;
        int mountsInTheEar = 12;
        int months = 0;
        double money = 0;
        String msg = "%d месяц, %.2f\n";
        while (months < ageLimit * mountsInTheEar) {
            money = money + money * 0.07;
            money = deposit + money;
            months++;
            if (months % 6 == 0) {
                System.out.printf(msg, months, money);
            }
        }
    }

    public static void task7() {
        int friday = 2;
        int daysMonth = 31;
        int week = 7;
        while (friday < daysMonth){
            System.out.println("Сегодня пятница ," + friday +  "-е число. Необходимо подготовить отчет.");
            friday = friday + week;
        }
    }

    public static void task8() {
        int thisYear = 2023;
        int startedTracking = thisYear - 200;
        int endOfTracking = thisYear + 100;
        for (int i = 0; i < endOfTracking; i+=79) {
            if(i > startedTracking && i < endOfTracking){
                System.out.println(i);
            }
        }
    }
}


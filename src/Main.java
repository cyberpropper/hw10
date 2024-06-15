import java.time.LocalDate;

public class Main {
    public static void printLeapYearStatus(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void softwareVersion(int deviceYear, int clientOS) {
        int currentYear = 2015;
        if (deviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для Android");
            }

        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установите версию приложения для Android");
            }
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        printLeapYearStatus(2014);
        softwareVersion(1999, 1);

        int deliveryDistance = 90;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }
    }
}

import java.time.LocalDate;

class Homework { // класс Homework
    public static void main(String[] args) { // Метод main
        task1(); // Объявили метод «задача1»
        task2(); // Объявили метод «задача2»
        task3(); // Объявили метод «задача3»
    }

    public static void task1() { // Вызвали метод «задача1»
        System.out.println("Задача №1.");
        determineYear(2019);
        determineYear(2020);
        determineYear(2021);
        determineYear(2022);
        determineYear(2023);
        determineYear(2024);
    }
    private static void determineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    public static void task2() { // Вызвали метод «задача2»
        System.out.println("Задача №2.");
        printInfo(0, 2020);
        printInfo(1, 2022);
    }

    private static void printInfo(int mobileOs, int mobileYear) {
        String os = defineOs(mobileOs);
        String version = defineVersion(mobileYear);
        System.out.println("Для ОС " + os + " установите " + version + " версию.");

    }

    private static String defineOs(int mobileOs) {
        if (mobileOs == 0){
            return "IOS";
        }else if (mobileOs == 1){
            return "Android";
        }else {
            return "некорректные данные";
        }
    }

    private static String defineVersion(int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear != mobileYear){
            return "lite";
        } else {
            return "обычную";
        }
    }

    public static void task3() { // Вызвали метод «задача3»
        System.out.println("Задача №3.");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + defineDeliveryDays(deliveryDistance));
    }

    private static int defineDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20){
            deliveryDays = 1;
        } else if (distance <= 60){
            deliveryDays = 2;
        } else if (distance <= 100){
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
}
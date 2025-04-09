package Lesson_23.hw;

public class MonthCalculator {

    public static void getDays(String month){
        int amountOfDays = switch (month) {
            case "Січень", "Березень", "Липень", "Серпень", "Жовтень", "Грудень" -> 31;
            case "Лютий" -> 28;
            case "Квітень", "Травень", "Червень", "Вересень", "Листопад" -> 30;
            default -> throw new IllegalArgumentException("ДАЛБАЙОБ");
        };

        System.out.println("Днів в " + month + " - " + amountOfDays + " днів.");
    }

}

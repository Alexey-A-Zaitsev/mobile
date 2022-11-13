public class Main {
    public static void main(String[] args) {

        int initialBalance = -200; // Начальный баланс
        int replenishmentAmount = 1047; // Сумма пополнения
        int bonus = 0; // Размер бонуса

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        }
        int finalBalance = initialBalance + replenishmentAmount + bonus; // Итоговый баланс

        System.out.println("Итоговый баланс:" + finalBalance);
        System.out.println("Размер бонуса:" + bonus);

    }
}
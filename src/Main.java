public class Main {
    public static void main(String[] args) {
        int score = 100; // у клиента на счету;
        int y = 1100; //Клиент пополнил счёт на 1100 рублей;
        int bonus;

        if (y > 1000) {
            bonus = y / 100;
        }
        else {
            bonus = 0;
        }
        int balance = score + y + bonus;
        System.out.println("Итоговый счёт: " + balance +"руб.Бонусные рубли:"+ bonus + "руб.");
    }
}

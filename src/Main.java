public class Main {

    public static void main(String[] args) {
        int replenishment = 1100;
        int bonus = 1;

        int result = replenishment + bonus;
        if (replenishment != 1100) {
            bonus = replenishment / 100;
        }

        System.out.println("Сумма пополнения счёта:"+ (replenishment)+ " рублей");
        System.out.println("Итоговый счёт :" + (replenishment + bonus) + " рублей");
        System.out.println("Количество бонусных рублей:" + (bonus) + "рублей");

    }
}


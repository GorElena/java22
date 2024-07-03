public class Main {

    public static void main(String[] args) {
        int initalBalance = 100;// исходный баланс
        int replenishment=1500;// сумма пополнения
        int bonus;
            bonus=1;
        if (replenishment > 1000){
            bonus = replenishment / 100;
        } else {
            bonus =0;
        }
        int balance= initalBalance +replenishment + bonus;
        System.out.println("Начислено бонусов:"+ bonus);
        System.out.println("Итоговый счёт :" +balance +"рублей");


    }
}


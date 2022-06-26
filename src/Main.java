public class Main {

    public static void main(String[] args) {
        int balance = 122;
        int replenishment = 1368;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int FinalBalance = balance + replenishment + bonus;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговый балас: " + FinalBalance);


    }

}

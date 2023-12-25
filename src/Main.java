
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int clientAccount = 100;
        int refill = 1100;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = clientAccount + refill + bonus;

        System.out.println("Итоговая сумма на счету клиента: " + totalAmount);

        System.out.println("Итоговая сумма бонуса: " + bonus);
    }
}
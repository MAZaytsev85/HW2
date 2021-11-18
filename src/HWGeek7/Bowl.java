package HWGeek7;

public class Bowl {

    private int foodAmount;

    public boolean decraaseFood (int amount) {
        if (foodAmount < amount || amount < 0) {
            System.out.println("Please put food in Bowl");
            return false;
        }
        foodAmount -= amount;
        System.out.printf("Food decreased for %d, %d left\n", amount, foodAmount);
        return true;

    }

    public void putFood (int amount) {
        if (amount < 0) {
            return;
        }
        foodAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

}

public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 2970; // Example amount from your code

        System.out.println("BPI ATM Processing: PHP " + amount);

        // Standard ATM validation for PHP denominations (smallest is 20)
        if (amount % 10 != 0 || amount < 20) {
            System.out.println("Amount should be in multiples of 10s and at least 20.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}
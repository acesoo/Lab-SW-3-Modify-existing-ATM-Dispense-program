public class Peso20Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20 bills");
            if (remainder != 0) {
                System.out.println("Remaining PHP " + remainder + " cannot be dispensed.");
            }
        } else {
            System.out.println("Amount PHP " + cur.getAmount() + " is too small to dispense.");
        }
    }
}
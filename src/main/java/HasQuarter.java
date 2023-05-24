import java.util.Random;

public class HasQuarter implements State{
    Random rand = new Random(System.currentTimeMillis());
GumballMachine gumballMachine;

    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;

    }

    @Override
    public void insertCoin() {
        System.out.println("я тебе не банк");


    }

    @Override
    public void ejectCoin() {
        System.out.println("монетка вернулась");
        gumballMachine.setState(gumballMachine.getNoQarter());
    }

    @Override
    public void turnCrank() {
        int win = rand.nextInt(10);
        if (win == 3 && gumballMachine.getCount()>0) {
            System.out.println("выигрыш");
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            System.out.println("дернут рычаг");
            gumballMachine.setState(gumballMachine.getSold());
        }
    }

    @Override
    public void dispenceBall() {
        System.out.println("сначала заплати, кожаный мешок");

    }

    @Override
    public void refill() {

    }
}

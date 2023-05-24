public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("error");

    }

    @Override
    public void ejectCoin() {
        System.out.println("error");
    }

    @Override
    public void turnCrank() {
        System.out.println("error");
    }

    @Override
    public void dispenceBall() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.soldOut);
        } else {

            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                System.out.println("winner");
                gumballMachine.setState(gumballMachine.getNoQarter());
            } else {
                System.out.println("oops");
                gumballMachine.setState(gumballMachine.getSoldOut());
            }
        }
    }

    @Override
    public void refill() {

    }
}

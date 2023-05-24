public class NoQarter implements State{
    GumballMachine gumballMachine;

    public NoQarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("монетка брошена");
    gumballMachine.setState(gumballMachine.getHasQuarter());

    }

    @Override
    public void ejectCoin() {
        System.out.println("ничего не верну");

    }

    @Override
    public void turnCrank() {
        System.out.println("не дергай, придурок");

    }

    @Override
    public void dispenceBall() {
        System.out.println("сначала заплати, кожаный мешок");

    }

    @Override
    public void refill() {

    }
}

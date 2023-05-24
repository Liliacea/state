public class Sold implements State {
    GumballMachine gumballMachine;

    public Sold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("я тебе не банк");

    }

    @Override
    public void ejectCoin() {
        System.out.println("и ничего не верну");

    }

    @Override
    public void turnCrank() {
        System.out.println("додергался?");

    }

    @Override
    public void dispenceBall() {
        System.out.println("шарик в выдаче");
        if (gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getNoQarter());
            gumballMachine.count--;
        } else {
            gumballMachine.setState(gumballMachine.getSoldOut());
        }
    }

    @Override
    public void refill() {

    }
}

public class SoldOut implements State{
    GumballMachine gumballMachine;

    public SoldOut(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("нет смысла платить, шариков нет");
    }

    @Override
    public void ejectCoin() {
        System.out.println("я не могу ничего вернуть, я так пуст");
    }

    @Override
    public void turnCrank() {
        System.out.println("не дергай меня за рычаг, итак больно");
    }

    @Override
    public void dispenceBall() {
        System.out.println("у меня ничегошеньки не осталось");
    }

    @Override
    public void refill() {
    gumballMachine.setState(gumballMachine.noQarter);

    }
}

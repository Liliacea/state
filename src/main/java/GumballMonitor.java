public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }
    public void printState(){
        System.out.println("Location " + machine.getLocation());
        System.out.println("number of balls " + machine.getCount());
        System.out.println("state now " + machine.getState());
    }
}

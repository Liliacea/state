public class GumballMachine {
    State noQarter;
    State hasQuarter;
    State sold;
    State soldOut;
    State winnerState;
    public int count = 0;
    String location;
    State state = soldOut;

    public GumballMachine(String location, int numberOfGumballs) {

        noQarter = new NoQarter(this);
        hasQuarter = new HasQuarter(this);
        sold = new Sold(this);
        soldOut = new SoldOut(this);
        winnerState = new WinnerState(this);
        this.location = location;
        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQarter;
        } else {
            state = soldOut;
        }
    }



    public void insertCoin(){
        state.insertCoin();
    }
    public void ejectCoin(){
        state.ejectCoin();
    }
    public void refill(int count) {
        this.count += count;
        System.out.println("Заполнено на "  + count);
        state.refill();}
    public void turnCrank() {
        state.turnCrank();
        if (hasQuarter != null)


            state.dispenceBall();



    }
    public String getLocation() {
        return location;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getNoQarter() {
        return noQarter;
    }

    public void setNoQarter(State noQarter) {
        this.noQarter = noQarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public void setHasQuarter(State hasQuarter) {
        this.hasQuarter = hasQuarter;
    }

    public State getSold() {
        return sold;
    }

    public void setSold(State sold) {
        this.sold = sold;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(State soldOut) {
        this.soldOut = soldOut;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void releaseBall(){
        System.out.println("шарик в выдаче");
        if(count!=0){
            count = count-1;
        }

    }
}

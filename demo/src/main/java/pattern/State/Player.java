package pattern.State;

public class Player {
    private int x;
    private int y;
    private int size = 2;
    private PlayerStatesInterface state;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;        
        this.state = new StandingState();
    }

    public void reactToTrigger(Trigger t) {
        this.state.handleTriggers(this, t);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PlayerStatesInterface getState() {
        return state;
    }

    public void setState(PlayerStatesInterface state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Player is in state: %s, current y: %d, current size: %d",
        this.state.getStateName(), this.getY(), this.getSize());
    }

}

package pattern.State;

public class JumpingState implements PlayerStatesInterface {

    @Override
    public void handleTriggers(Player p, Trigger t) {
        if (t == Trigger.PRESS_DOWN) {
            dive(p);
            p.setState(new StandingState());
        }
    }

    private void dive(Player p) {
        p.setY(p.getY() - 3);
    }

    @Override
    public String getStateName() {
        return "Jump state";
    }

}

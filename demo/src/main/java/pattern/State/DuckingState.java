package pattern.State;

public class DuckingState implements  PlayerStatesInterface {

    @Override
    public void handleTriggers(Player p, Trigger t) {
        if (t == Trigger.RELEASE_DOWN) {
            unduck(p);
            p.setState(new StandingState());
        }
    }

    private void unduck(Player p) {
        p.setSize(2);
    }

    @Override
    public String getStateName() {
        return "Duck state";
    }
}

package pattern.State;

public class StandingState implements PlayerStatesInterface {

    @Override
    public void handleTriggers(Player p, Trigger t) {
        if (t == Trigger.PRESS_UP) {
            jump(p);
            p.setState(new JumpingState());
        } else if (t == Trigger.PRESS_DOWN) {
            duck(p);
            p.setState(new DuckingState());
        }
    }

    private void jump(Player p) {
        p.setY(p.getY() + 3);
    }

    private void duck(Player p) {
        p.setSize(1);
    }

    @Override
    public String getStateName() {
        return "Standing state";
    }
}

package pattern.State;

public interface PlayerStatesInterface {
    void handleTriggers(Player p, Trigger t);
    String getStateName();
}
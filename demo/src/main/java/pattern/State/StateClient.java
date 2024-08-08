package pattern.State;

public class StateClient {

    public static void run() {
        Player jatekos = new Player(1, 10);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.RELEASE_DOWN);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_UP);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_UP);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_UP);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_DOWN);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_DOWN);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.PRESS_DOWN);
        System.out.println(jatekos.toString());
        jatekos.reactToTrigger(Trigger.RELEASE_DOWN);
        System.out.println(jatekos.toString());


    }
}


import java.util.ArrayList;
import java.util.Stack;

import pattern.Command.*;
import pattern.Decorator.*;
import pattern.Factory.FactoryClient;
import pattern.Iterator.IteratorClient;
import pattern.Observer.ObserverClient;
import pattern.Singleton.*;
import pattern.State.StateClient;
import pattern.Strategy.*;
import pattern.Swing.GUI;
import pattern.Template.TemplateClient;
import pattern.Threading.ThreadingClient;

public class Main {
    public static void main(String[] args) {
        //DecoratorClient.run();
        //CommandClient.run();
        //StrategyClient.run();
        //IteratorClient.run();
        //TemplateClient.run();
        //StateClient.run();
        //FactoryClient.run();
        //ThreadingClient.run();
        //GUI.runGUI();
        ObserverClient.run();
    }
}
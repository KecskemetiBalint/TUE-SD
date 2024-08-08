package pattern.Swing; 
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    private static JFrame mainFrame;
    private static JLabel progress;

    public static void runGUI() {
        // schedule GUI creation before displaying and return
        // start the event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initGUI();
            }
        });
    }

    private static void initGUI() {
        mainFrame = new JFrame("Swing Demo");
        mainFrame.setSize(400, 300); // do not forget
        mainFrame.setLayout(new GridLayout(2, 1));
        // exiting the app is quick (to terminate), action on the event dispatch thread
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // create GUI elements and add to window
        progress = new JLabel("Not done yet", JLabel.CENTER);
        mainFrame.add(progress);
        JButton button = new JButton("Start counter");
        button.setPreferredSize(new Dimension(5, 5));
        // implement what happens on clicking the button, executing on SwingWorker
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startWorker();
            }
        });
        mainFrame.add(button);
        mainFrame.setVisible(true); // do not forget this
    }
  private static void startWorker() {
        // SwingWorker<T, V> (can be void or omitted)
        // T is the return type of doInBackground and getters
        // V is the type for intermediate results (for process)
        // none of the following methods is called
        SwingWorker<String, Integer> worker = new SwingWorker<String, Integer>() {
            // define what the worker shall do
            @Override
            protected String doInBackground() throws InterruptedException {
                for (Integer i = 10; i >= 0; i--) {
                    Thread.sleep(100); // sleep lets a thread wait for milliseconds
                    publish(i); // sends intermediate results to process method
                }
                return "Done";
            }

            // do something with intermediate results
            @Override
            protected void process(List<Integer> chunks) {
                Integer lastValue = chunks.get(chunks.size() - 1);
                progress.setText(String.valueOf(lastValue));
            }

            // do something upon finishing
            @Override
            protected void done() {
                try {
                    String message = get();
                    progress.setText(message);
                } catch (InterruptedException | ExecutionException ignore) {
                }
            }
        };
        // start the worker, will call doInBackground
        worker.execute();
    }
}

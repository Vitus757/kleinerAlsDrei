import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Herz extends JFrame{

    public JFrame frame;

    public Herz() {
        frame = new JFrame("<3");

        int breite = 500;
        int höhe = 500;

        frame.setSize(breite, höhe);
        frame.setLayout(null);
        frame.setVisible(true);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override

            public void run() {
            JLabel feld = new JLabel("<3");
            feld.setSize(60,30);
            frame.add(feld);
            double x = Math.random() * (1.72 - (-1.72)) + (-1.72); //Math.random() * (max - min) + min;
            double y = heartMethode(x);
            x *= 100;
            x += 220;
            y *= -100;
            y += 250;
            feld.setLocation((int) x, (int) y);
            feld.setVisible(true);
            }
        };

        timer.scheduleAtFixedRate(task, 200,300);
        
        /*
        for(int i = 0; i < 500; i++)
        {
            JLabel feld = new JLabel("<3");
            feld.setSize(60,30);
            frame.add(feld);
            double x = Math.random() * (1.72 - (-1.72)) + (-1.72); //Math.random() * (max - min) + min;
            double y = heartMethode(x);
            x *= 100;
            x += 220;
            y *= -100;
            y += 250;
            feld.setLocation((int) x, (int) y);
            feld.setVisible(true);
        }
            */
    }

    private double heartMethode(double x) {
        int neg = 1;
        if(x < 0) 
        {
            x = -x;
            neg = -1;
        }
        return Math.pow(x, 2.0 / 3.0) + 0.9 * Math.sin(30 * x) * Math.pow(3 - x * x, 1.0 / 2.0) * neg;
    }
}

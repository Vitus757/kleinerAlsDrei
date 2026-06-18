import javax.swing.*;

public class Herz extends JFrame{

    public Herz() {
        JFrame frame = new JFrame("<3");

        int breite = 500;
        int höhe = 500;

        //h/b anpassen!!!!!!!!!!!!!!!!!
        frame.setSize(breite, höhe);
        frame.setLayout(null);
        frame.setVisible(true);
        for(int i = 0; i < 600; i++)
        {
            JLabel feld = new JLabel("Alissa <3");
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

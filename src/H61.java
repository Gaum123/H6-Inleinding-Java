import java.awt.*;
import java.applet.*;


public class H61 extends Applet {
    int a, b, c, d;
    double uitkomst;


    public void init() {
        a = 50;
        b = 50;
        c = 13;
        d = 4;
        uitkomst = (a + b + c) / d;
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

        g.drawString("€28", 20, 40);
        g.drawString("Jan", 20, 60);

        g.drawString("€28", 100, 40);
        g.drawString("Ali", 100, 60);

        g.drawString("€28", 180, 40);
        g.drawString("Jeannette", 180, 60);

        g.drawString("€28", 280, 40);
        g.drawString("Ik", 280, 60);
    }
}
package hW13;

import java.applet.Applet;
import java.awt.*;

public class TestApplet extends Applet
{
    public void init()
    {
        Label labelName = new Label("Hello World");
        add(labelName);
    }
    public void paint(Graphics g)
    {
        g.drawOval(20,20,200,120);
        g.setColor(Color.green);
        Point s = new Point(70,30);
        new Point(10,2);
        System.out.println(s);

        g.fillOval((int)s.getX(),(int)s.getY(),100,100);


    }

}

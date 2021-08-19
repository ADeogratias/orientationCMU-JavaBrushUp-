package hW13;

/*  On my honor, as a Carnegie-Mellon Africa student,
        *  I have neither given nor received unauthorized assistance on this work.
        *
        *  giving credits to
        *  @author Cathy Bishop I used her codes that were posted online.
        *  http://public.africa.cmu.edu/cbishop/orientation/java/
        *
        *  And me
        *  Deogratias Amani
        */
import java.awt.*;

public class BullsEye 
{
    Color color1, color2;
    int width;
    int height;
    Point center;

    public BullsEye()
    {
        this.color1 = Color.RED;
        this.color2 = Color.BLUE;
        this.width = 200;
        this.height = 200;
        this.center = new Point(150,70);
    }

    public BullsEye(Color color1, Color color2)
    {
        this.color1 = color1;
        this.color2 = color2;
        this.width = 400;
        this.height = 200;
        this.center = new Point(300,140);
    }

    public BullsEye(Color color1, Color color2, int width)
    {
        this.color1 = color1;
        this.color2 = color2;
        this.width = width;
        this.height = 200;
        this.center = new Point(500,210);
    }

    public BullsEye(Color color1, Color color2, int width, int height)
    {
        this.color1 = color1;
        this.color2 = color2;
        this.width = width;
        this.height = height;
        this.center = new Point(500,210);
    }

    public BullsEye(Color color1, Color color2, int width, Point center)
    {
        this.color1 = color1;
        this.color2 = color2;
        this.width = width;
        this.center = center;
    }

    public Color getColor1() { return color1; }
    public Color getColor2() { return color2; }
    public int getHeight() { return height; }
    public int getWidth() { return width; }
    public Point getCenter() { return  center; }
    public void setColor1(Color color1) { this.color1 = color1; }
    public void setColor2(Color color2) { this.color2 = color2; }
    public void setWidth(int witdth) { this.width = witdth; }
    public void setCenter(Point point) { this.center = point; }
    public void setHeight(int height ) { this.height = height; }


    public void setFillOn()
    {
    }

    public void setOutlineOn()
    {
    }

    //I will clean and make function well after.

    public void paint(Graphics g)
    {
        int small = 50, move = 25;
//        g.setColor(Color.red);
//        g.drawOval((int)getCenter().getX(),(int) getCenter().getY(),200,200);
//        g.setColor(Color.GREEN);
//        g.fillOval( (int)getCenter().getX()+5,(int) getCenter().getY()+5,200,200);

        g.drawOval((int)center.getX(),(int)center.getY(),width,height);
        g.setColor(getColor1());
        g.fillOval( (int)center.getX(),(int)center.getY(), width-small, height-small );
        g.setColor(getColor2());
        g.fillOval( (int)center.getX(),(int)center.getY(),
                width-small-small,
                height-small-small );
        g.setColor(getColor1());
        g.fillOval( (int)center.getX(), (int)center.getY(),
                width-small-small-small,
                height-small-small-small );
//        getColor2();
//        g.fillOval( 150+50+25,75+50+25 , 50, 50 );
    }

    public void setOutlineOff()
    {
    }


}

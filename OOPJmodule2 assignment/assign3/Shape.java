public interface Shape
{
    public double area();
}

public abstract class Circle implements Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return radius;
    }

}

public abstract class Circle implements Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return radius;
    }

}


public abstract class Circle implements Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return radius;
    }

}


import java.awt.Color;
import java.awt.Graphics;

public class DrawableCircle extends Circle implements Drawable
{
    public DrawableCircle(double radius)
    {
        super(radius);
    }

    @Override
    public void setColour(Color c)
    {
        c = Color.ORANGE;
    }

    @Override
    public void setPosition(int x, int y)
    {
        x = 100;
        y = 150;
    }

    @Override
    public void draw(Graphics g)
    {
        //g.drawOval(x, y, width, height);
    }

}


import java.awt.Color;
import java.awt.Graphics;

public class DrawableRectangle extends Rectangle implements Drawable
{
    private double x, y;

    public DrawableRectangle(double height, double width)
    {
        super(height, width);
    }

    @Override
    public void setColour(Color c)
    {
        this.setColour(c);
    }

    @Override
    public void setPosition(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g)
    {
        g.drawRect(x, y, width, height);
    }

}
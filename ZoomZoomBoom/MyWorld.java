import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(1000, 700, 1); 
        prepare();
    }
    private void prepare()
    {
        Red red = new Red();
        addObject(red,100,400);
        Green green = new Green();
        addObject(green,900,400);
        Top top = new Top();
        addObject(top,0,0);
    }
}

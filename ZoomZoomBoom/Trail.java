import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trail extends Actor
{
    /**
     * Act - do whatever the Trail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage dot;
    public Trail(Color color){
        dot = new GreenfootImage(3, 2);
        dot.setColor(color);
        dot.fill();
        setImage(dot);
        
        /*dot = new GreenfootImage(3, 2);
        dot.setColor(color);
        dot.fill();*/
    }
    
    public void act() 
    {
        // Add your action code here.
    }
}

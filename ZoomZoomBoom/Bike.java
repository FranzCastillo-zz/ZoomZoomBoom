import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bike extends Actor
{
    /**
     * Act - do whatever the Bike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    
    public void leaveTrail(Color color){
        getWorld().addObject(new Trail(color), getX(), getY());
    }
}

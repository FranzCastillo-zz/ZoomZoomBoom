import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Bike
{
    /**
     * Act - do whatever the Red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(40, 20);
        setImage(image);
        setLocation(100,400);
    }    
}

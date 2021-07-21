import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenShoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenShoot extends Projectile
{
    /**
     * Act - do whatever the GreenShoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage dot = new GreenfootImage(3, 2);
        dot.setColor(Color.BLACK);
        dot.fill();
        setImage(dot);
        move(10);
    }    
}

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
        GreenfootImage img = new GreenfootImage(8,8);
        img.setColor(color);
        img.fill();
        setImage(img);
    }
    
    public void act() 
    {
        if(isTouching(Projectile.class)){
            getWorld().removeObject(this);
        }
    }
}

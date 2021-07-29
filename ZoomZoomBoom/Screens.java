import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screens extends Actor
{
    boolean scoreAdded = false;
    int redValue;
    int greenValue;
    public void restart(){
        MyWorld world = (MyWorld)getWorld();
        
        if(Greenfoot.mouseClicked(this)){
            world.removeObjects(getWorld().getObjects(Trail.class));
            world.removeObjects(getWorld().getObjects(Green.class));
            world.removeObjects(getWorld().getObjects(Red.class));
            world.removeObjects(getWorld().getObjects(Screens.class));
            world.addObject(new Green(), 900, 400);
            world.addObject(new Red(), 100, 400);
            world.addObject(new Timer(), 500, 100);
            //Greenfoot.setWorld(new MyWorld());
        }
    }
}


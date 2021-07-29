import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Screens
{
    public void act() 
    {
        restart();
    }

    public Winner(String winner){
        setImage(new GreenfootImage(winner, 50, Color.BLACK, new Color(255, 230, 128)));
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Screens
{
    public PlayAgain(){
        setImage(new GreenfootImage("¿Desea jugar de nuevo? Haga click aquí", 50, Color.BLACK, new Color(255, 230, 128)));
    }
    
    public void act() 
    {
        restart();
    }
   
}

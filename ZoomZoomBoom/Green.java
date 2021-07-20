import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Bike
{
    /**
     * Act - do whatever the Green wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    private int Speed = 5;
    
    public Green(){
        GreenfootImage image = getImage();  
        image.scale(45, 20);
        setImage(image);
        setLocation(900,400);
        setRotation(180);
    }
    
    public void act() 
    {
        moveAround();
        crash();
    }
    
    private void moveAround(){
        move(Speed);
        if(Greenfoot.isKeyDown("up") && getRotation() != Down){
            setRotation(Up);
        }
        if(Greenfoot.isKeyDown("left") && getRotation() != Right ){
            setRotation(Left);
        }        
        if(Greenfoot.isKeyDown("down") && getRotation() != Up){
            setRotation(Down);
        }
        if(Greenfoot.isKeyDown("right") && getRotation() != Left){
            setRotation(Right);
        }
    }
    
    public void setSpeed(int newSpeed){
        Speed = newSpeed;
    }
}

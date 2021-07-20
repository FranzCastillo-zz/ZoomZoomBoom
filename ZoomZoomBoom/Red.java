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
    
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    private final int Speed = 5;
    
    public Red(){
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(40, 20);
        setImage(image);
    }
    
    public void act() 
    {
        moveAround();
        crash();
    }
    
    public void moveAround(){
        move(Speed);
        if(Greenfoot.isKeyDown("w") && getRotation() != Down){
            setRotation(Up);
        }
        if(Greenfoot.isKeyDown("a") && getRotation() != Right ){
            setRotation(Left);
        }        
        if(Greenfoot.isKeyDown("s") && getRotation() != Up){
            setRotation(Down);
        }
        if(Greenfoot.isKeyDown("d") && getRotation() != Left){
            setRotation(Right);
        }
    }

}

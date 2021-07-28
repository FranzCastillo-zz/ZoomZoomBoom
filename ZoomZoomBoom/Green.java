import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Bike
{
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    static int Speed = 5;
    public static void setSpeed(int newSpeed){
        Speed = newSpeed;
    }
    
    public Green(){
        GreenfootImage image = new GreenfootImage(10,10);
        image.setColor(new Color(72, 181, 0));
        image.fill();
        setImage(image);
        setRotation(180);
        setSpeed(5);
    }
    

    public void act() 
    {
        setTime(getTime() - 1);
        Bike.delay();
        moveAround();
        crash("ROJO");
        Shoot("shift");
    }
    
    
    private void moveAround(){
        setCounter(getCounter() + 1);
        if(getCounter() == Speed){
            if(getTime() <= 0){
                leaveTrail(new Color(72, 181, 100));
            }
            move(Speed * 2);
            setCounter(0);
        }
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
}

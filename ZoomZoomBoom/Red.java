import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Red extends Bike
{
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    static int Speed = 5;
    public static void setSpeed(int newSpeed){
        Speed = newSpeed;
    }
    public static int getSpeed(){
        return Speed;
    }
    
    public Red(){
        /*GreenfootImage image = new GreenfootImage(10,10);
        image.setColor(Color.RED);
        image.fill();
        setImage(image);*/
        GreenfootImage image = getImage();  
        image.scale(10, 10);
        setImage(image);
        setRotation(0);
        setSpeed(5);
    }
    public void act() 
    {
        setTime(getTime() - 1);
        Bike.delay();
        moveAround();
        crash("VERDE");
        Shoot("space");
    }
    public void moveAround(){
        setCounter(getCounter() + 1);
        if(getCounter() == Speed){
            if(getTime() <= 0){
                leaveTrail(Color.RED);
            }
            move(Speed * 2);
            setCounter(0);
        }
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

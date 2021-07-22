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
    
    private int counter = 0;
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
    }
    
    public void act() 
    {
        Bike.delay();
        moveAround();
        crash();
        Shoot("control");
    }
    
    private void moveAround(){
        counter++;
        if(counter == Speed){
            leaveTrail(new Color(72, 181, 100));
            move(Speed * 2);
            counter = 0;
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
    
    private void crash(){
        String looser = "";
        World world = getWorld();
        if(isTouching(Trail.class) || isTouching(Top.class) || isAtEdge() || isTouching(Projectile.class)){ //Agregar cabeza con cabeza y trail  || isTouching(Trail.class)
            Red.setSpeed(0);
            setSpeed(0);
            Winner win = new Winner("GANA EL ROJO");
            PlayAgain restart = new PlayAgain();
            
            world.addObject(win, 500,500);
            world.addObject(restart, 500,650);
        }
    }
}

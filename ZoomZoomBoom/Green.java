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
    
    static int Speed = 5;
    
    public Green(){
        GreenfootImage image = getImage();  
        image.scale(45, 20);
        setImage(image);
        setLocation(900,400);
        setRotation(180);
        Speed = 5;
    }
    
    
    public void act() 
    {
        moveAround();
        crash();
        leaveTrail(Color.GREEN);
        /*if(getRotation() == Left){
            leaveTrail(new Color(103, 207, 0), getX() + 30, getY());
        }
        if(getRotation() == Right){
            leaveTrail(new Color(103, 207, 0), getX() - 30, getY());
        }
        if(getRotation() == Up){
            leaveTrail(new Color(103, 207, 0), getX(), getY() + 30);
        }
        if(getRotation() == Down){
            leaveTrail(new Color(103, 207, 0), getX() + 30, getY() - 30 );
        }*/
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
    
    
    public static void setSpeed(int newSpeed){
        Speed = newSpeed;
    }
    
    private void crash(){
        String looser = "";
        World world = getWorld();
        if(isAtEdge() || isTouching(Top.class)){ //Agregar cabeza con cabeza y trail  || isTouching(Trail.class)
            Red.setSpeed(0);
            setSpeed(0);
            Winner win = new Winner("GANA EL ROJO");
            PlayAgain restart = new PlayAgain();
            
            world.addObject(win, 500,500);
            world.addObject(restart, 500,650);
        }
    }
}

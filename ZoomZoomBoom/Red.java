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
    static int Speed;
    
    public Red(){
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(40, 20);
        setImage(image);
        Speed = 5;
    }
    
    public void act() 
    {
        moveAround();
        //crash();
        leaveTrail(Color.RED);
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
    
    public static void setSpeed(int newSpeed){
        Speed = newSpeed;
    }
    
    public void crash(){
        /*
         * 
         * Si chocas con la orilla
         * Si chocas con la cabeza del otro
         * Si
         * 
         */
        World world = getWorld();
        String looser = "";
        
        if(isAtEdge()){
            Red.setSpeed(0);
            Green.setSpeed(0);
            
        }
        // Verifica si no quedan jugadores rojos en el mapa
        if(world.getObjects(Red.class).size() != 0){
        }
    }
}

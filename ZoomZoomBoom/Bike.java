import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bike extends Actor
{
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    private int counter = 0;
    static int Speed = 5;
    
    public static int stop=0;
    public static int delay=0;
    public void leaveTrail(Color color){
        if(color != Color.RED){
            getWorld().addObject(new Trail(color), getX()+1, getY()+1);
        }
        else{
            getWorld().addObject(new Trail(color), getX()+1, getY()+1);
        }
    }
    
    public void crash(String winner){
        String looser = "";
        World world = getWorld();
        if(isTouching(Trail.class) || isTouching(Top.class) || isAtEdge() || isTouching(Projectile.class)){ //Agregar cabeza con cabeza y trail  || isTouching(Trail.class)
            Red.setSpeed(0);
            Green.setSpeed(0);
            Winner win = new Winner("GANA EL " + winner);
            PlayAgain restart = new PlayAgain();
            
            world.addObject(win, 500,500);
            world.addObject(restart, 500,650);
        }
    }
    public void Shoot(String key){
        if(Greenfoot.isKeyDown(key)){
            int distance = 50;
            if(getRotation() == Up){
                getWorld().addObject(new Projectile(getRotation()), getX(), getY() - distance);
            }
            if(getRotation() == Down){
                getWorld().addObject(new Projectile(getRotation()), getX(), getY() + distance);
            }
            if(getRotation() == Right){
                getWorld().addObject(new Projectile(getRotation()), getX() + distance, getY());
            }
            if(getRotation() == Left){
                getWorld().addObject(new Projectile(getRotation()), getX() - distance, getY());
            }
        }
    }
    public static void delay()
    {
        if(delay==0){
            Greenfoot.delay(30);
            delay=1;
        }
    }
    public static void setDelay(int x)
    {
        delay = x;
    }
}

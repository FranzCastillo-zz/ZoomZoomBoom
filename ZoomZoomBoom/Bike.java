import greenfoot.*;

public class Bike extends Actor
{
    // ---------------------------- VARIABLES ------------------------------
    private final int Right = 0;
    private final int Up = 270;
    private final int Left = 180;
    private final int Down = 90;
    
    static int Speed = 5;
    
    public static int stop=0;
    public static int delay=0;
    static String winner;
    //-----------------------------------------------------------------------
    //VERIFICA QUE YA AVANZO LA DISTANCIA NECESARIA PARA PODER DEJAR UN RASTRO
    private int counter = 0;
    public void setCounter(int x){
        counter = x;
    }
    public int getCounter(){
        return counter;
    }

    //TIEMPO PARA ACTIVAR LOS TRAILS
    private static int time;
    public static void setTime(int x){
        time = x;
    }
    public static int getTime(){
        return time;
    }
    
    public int timer;
    
    public Bike(){
        timer = 10;
        setTime(1000);
    }
    
    public void leaveTrail(Color color){
        timer--;
        if(timer <= 0){
            if(color != Color.RED){
                getWorld().addObject(new Trail(color), getX()+1, getY()+1);
            }
            else{
                getWorld().addObject(new Trail(color), getX()+1, getY()+1);
            }
        }
    }
       
    public static String getWinner(){
        return winner;
    }
    public void setWinner(String theWinner){
        winner = theWinner;
    }
    
    public void crash(String theWinner){
        String looser = "";
        MyWorld world = (MyWorld)getWorld();
        if(isTouching(Trail.class) || isTouching(Top.class) || isAtEdge() || isTouching(Projectile.class)){ 
            Winner win = new Winner("GANA EL " + theWinner);
            setWinner(theWinner);
            PlayAgain restart = new PlayAgain();
            
            world.addObject(win, 500,500);
            world.addObject(restart, 500,650);
            world.removeObjects(world.getObjects(Timer.class));
            
            if(theWinner == "ROJO"){
                Red.setSpeed(0);
                getWorld().removeObjects(getWorld().getObjects(Green.class));
                Counter rc = world.getRedCounter();
                rc.add(1);
            }
            else{
                Green.setSpeed(0);
                getWorld().removeObjects(getWorld().getObjects(Red.class));
                Counter gc = world.getGreenCounter();
                gc.add(1);
            }
        }
        else if(isTouching(Bike.class)){ // Si chocan entre cabezas
            Winner win = new Winner("EMPATE");
            PlayAgain restart = new PlayAgain();
            
            world.addObject(win, 500,500);
            world.addObject(restart, 500,650);
            world.removeObjects(world.getObjects(Timer.class));
        }
    }
    
    public void Shoot(String key){
        if(Greenfoot.isKeyDown(key)){
            Greenfoot.playSound("Disparo.mp3");
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

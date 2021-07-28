import greenfoot.*;
public class Timer extends Top
{
    public void act() 
    {
        int time = Bike.getTime();
        if(time > 0){
            setImage(new GreenfootImage("Tiempo: " + time, 50, Color.BLACK, new Color(255, 224, 99)));
        }
        else if(time < -200){
            setImage(new GreenfootImage("", 50, Color.BLACK, new Color(255, 224, 99)));
        }
        else{
            setImage(new GreenfootImage("ZOOM ZOOM", 50, Color.BLACK, new Color(255, 224, 99)));
        }
    }
}

import greenfoot.*;
public class MyWorld extends World
{
    Counter greenCounter;
    Counter redCounter;
    public MyWorld()
    {    
        super(1000, 700, 1); 
        prepare();
    }
    private void prepare()
    {
        Red red = new Red();
        addObject(red,100,400);
        Green green = new Green();
        addObject(green,900,400);
        Top top = new Top();
        addObject(top,0,0);
        Timer timer = new Timer();
        addObject(timer, 500, 100);
        
        greenCounter = new Counter("Verde: ");
        addObject(greenCounter, 900,50);
        redCounter = new Counter("Rojo: ");
        addObject(redCounter, 75,50);
        
        
        setPaintOrder(Counter.class, Timer.class, Top.class);
    }
    public Counter getGreenCounter(){
        return greenCounter;
    }
    public Counter getRedCounter(){
        return redCounter;
    }
}

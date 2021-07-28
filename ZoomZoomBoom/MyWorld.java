import greenfoot.*;
public class MyWorld extends World
{
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
    }
}

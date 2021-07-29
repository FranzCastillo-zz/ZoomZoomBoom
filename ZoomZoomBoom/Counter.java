import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Counter extends Top
{
    int score;
    public Counter(String player){
        score = 0;
        setImage(new GreenfootImage(player +": " + score, 50, Color.BLACK, new Color(255, 224, 99)));
    }
    public void act() 
    {
        
    }    
    private void updateImage(int score){
        setImage(new GreenfootImage("Verde: " + score, 50, Color.BLACK, new Color(255, 224, 99)));
    }

    public  void addGreen(int score){
        score++;
        updateImage(score);
    }
    
    public void resetScore(){
        score = 0;
    }
}

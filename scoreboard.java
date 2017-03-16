import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreboard extends World
{

    int heart;
    /**
     * Constructor for objects of class scoreboard.
     * 
     */
    public scoreboard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        super(800, 400, 1); 
        click();
       
        addObject(new mon7(),565,187);
        showText("Score :" + score.score, getWidth()/2, getHeight()/2);
        addObject(new restart(),69,365);
       
    }
    public void click(){
    if(Greenfoot.mouseClicked(this)){
        score.score=0;
        heart=200;
        Greenfoot.setWorld(new level());
        
        
    }
}
    
}


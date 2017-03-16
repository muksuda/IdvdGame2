import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    /**
     * Constructor for objects of class win.
     * 
     */
    public win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new winn(),370,268);
        addObject(new pluu(),352,161);
         showText("Score :" + score.score,600 ,180 );
        
        addObject(new restart(),69,365);
        //click();
        checkre();
    }
    
    public void checkre(){
    if(Greenfoot.mouseClicked(this)){
    Greenfoot.setWorld(new level());
    score.score=0;
    man.heart=200;
    
    
    }
}
}

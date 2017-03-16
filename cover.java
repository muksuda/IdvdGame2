import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cover extends World
{

    /**
     * Constructor for objects of class cover.
     * 
     */
    public cover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addObject(new play(),383,200);
        addObject(new mon1(),469,353);
        addObject(new mon2(),371,353);
        addObject(new mon3(),430,355);
        addObject(new mon4(),400,365);
        addObject(new mon5(),330,348);
        addObject(new mon6(),294,354);
        addObject(new name(),394,81);
     
        Greenfoot.playSound("1.wav");
         check();
         sound();
         
         
    }
    public void  check(){
    if(Greenfoot.mouseClicked("play.png")){
    Greenfoot.setWorld(new level());
    }
}
    
    public void sound(){
        
    //Greenfoot.playSound("1.wav");
}
}



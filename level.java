import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{

    /**
     * Constructor for objects of class level.
     * 
     */
    public level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 400, 1); 
         addObject(new level1(),221,89);
         addObject(new level2(),224,196);
         addObject(new level3(),227,306);
        
       
    }
     
}


            

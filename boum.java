import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boum extends Actor
{
    /**
     * Act - do whatever the boum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(360);
        setLocation(getX(),getY()+2);
        touchground();
        // Add your action code here.
    }
    
    public void touchground(){
        if(isAtEdge()){
        getWorld().removeObject(this);
    }
    }
        
        
    }

    


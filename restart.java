import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends click
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        checkre();
        
        
        // Add your action code here.
    }  
    public void checkre(){
    if(Greenfoot.mouseClicked(this)){
    Greenfoot.setWorld(new level());
    score.score=0;
    man.heart=200;
    
    
    }
}

}



    


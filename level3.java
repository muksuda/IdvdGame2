import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends click
{
    /**
     * Act - do whatever the level3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKey2();
        // Add your action code here.
    }    
      public void checkKey2(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new hard());
         }
}
}
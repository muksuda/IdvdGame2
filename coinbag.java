import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coinbag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coinbag extends bag
{
    /**
     * Act - do whatever the coinbag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        //setRotation();
        setLocation(getX(),getY()+2);
        movement();
        
    }  
    
    public void checkscore(){
      if(isTouching(man.class)){
          score.score=+10;
        }
    }
    
      public void movement(){
        move(1);
        if(isTouching(man.class)||isAtEdge()){
        getWorld().removeObject(this);
      
}
}
}

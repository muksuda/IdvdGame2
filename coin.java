import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class coin extends Actor
{
    /**
     * Act - do whatever the coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(90);
        setLocation(getX(),getY()+2);
        
        checkscore();
        movement();
        }
        
   
    public void checkscore(){
       
      if(isTouching(man.class)){
          
          score.score++;
          if(score.score==50){
            Greenfoot.setWorld(new win());
            }
          
          
        }
            }
          
         
    
    public void movement(){
        move(1);
        if(isTouching(man.class)||(isAtEdge())){
        {
        getWorld().removeObject(this);
        
    }
}
    }
}


        
    
        
        
        
    
    

        
      
  
     
    
    


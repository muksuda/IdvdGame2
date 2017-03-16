import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monster extends Actor
{
    /**
     * Act - do whatever the monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int life = 10;
    public monster(String image){
        setImage(image + ".png");
    }
    
    public void act() 
    {
    mondie();
     //setLocation(getX()-1,getY());
     //kill();
     movement();
    } 
    
   
    public void hit (int damage){
    life = life- damage;
    if(life <=0){
        getWorld().removeObject(this);
   
    }
}
    public void movement(){
        move(-2);
        if((isAtEdge())){
        getWorld().removeObject(this);
    
    
   
    }
}

public void mondie(){
 if(life <=0){
  getWorld().removeObject(this);
  
}
}
}






 /*public void kill(){
         if(isTouching(man.class)){
             getWorld().removeObject(this);
            }
     }*/




    
  
   
        
       







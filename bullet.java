import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int damage = 1;
    public void act() 
    {
       setLocation(getX()+50,getY());
       if(isAtEdge()){
        getWorld().removeObject(this);
        return;
        }
        BulletHit();
      
      }
   
    
    private void BulletHit(){
     monster mon = (monster) getOneIntersectingObject(monster.class);
     if(mon != null){
        mon.hit(damage);
        getWorld().removeObject(this);
        }
    }
    }
   
    
    
   
    
    
        


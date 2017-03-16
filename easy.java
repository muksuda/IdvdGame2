import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class easy extends World
{  private int time2=0;
    private int time=0;
     //private int time3=0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    String [] mon ={"mon1","mon2","mon3"};
    public easy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400,1); 
        addObject(new man(),111,360);
        //addObject(new bag(),24,23);
        addObject(new back(),37,365);
        addObject(new heart(),21,62);
        
        
       
       
        
    }
   
    
    public void act(){
       time2++;
       time++;
       //time3++;
       if(time2==120){
       random();
       time2=0;
      }
      
      if(time== 30){
        
            addObject(new coin(),Greenfoot.getRandomNumber(600),0);

            time=0;
        }
        
        
        showText(" Score :"+ score.score,75,25);
    }
       
    public void random (){
    int x = Greenfoot.getRandomNumber(3);
    addObject(new monster (mon[x]),790,366);
    }
    
}



    /*public void checkre(){
    if(Greenfoot.mouseClicked(restart.class)){
    Greenfoot.setWorld(new easy());
    score.score=0;
    heart=200;
    }*/




   

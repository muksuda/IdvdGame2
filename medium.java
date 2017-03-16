import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class medium extends World
{
    
    

    /**
     * Constructor for objects of class medium.
     * 
     */
    private int time2=0;
    private int time=0;
    private int time3 =0;
    public  int ground=340;
    
      String [] mon ={"mon1","mon2","mon3","mon4","mon5"};
    public medium()
    {    
        
        super(800, 400,1); 
        addObject(new man(),98,340);
        //addObject(new bag(),24,23);
        addObject(new back(),37,365);
        addObject(new heart(),21,62);
        
        //clickre();
    }
   
    
    public void act(){
       time2++;
       time++;
       time3++;
       if(time2==100){
       random();
       time2=0;
      }
      
      if(time== 30){
        
            addObject(new coin(),Greenfoot.getRandomNumber(600),0);

            time=0;
        }
       if(time3==100){
            addObject(new boum(),Greenfoot.getRandomNumber(600),0);

            time3=0;
        
        }
     showText(" Score :"+ score.score,75,25);
    }
       
    public void random (){
    int x = Greenfoot.getRandomNumber(5);
    addObject(new monster (mon[x]),790,366);
    }
    
   
    
    
}



    
   

    


    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class man here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class man extends Actor
    {
     int Speed;
     static int heart = 200;
     public  int ground=350;
     
        /**
         * Act - do whatever the man wants to do. This method is called whenever
        * the 'Act' or 'Run' button gets pressed in the environment.
         */
      
     public void act() 
     {
            checkKeypress();
          
           shoot();
            jump();
            touchboum();
            delete();
            getWorld().showText(""+heart,55,62);
            
     }
    
     public void  checkKeypress(){
        if(Greenfoot.isKeyDown("left")){
            setImage("manr.png");
            move(-3); 
        }
        if(Greenfoot.isKeyDown("right")){
            setImage("manl.png");
            move(3); 
        }
     }
     public void jump()
      {
        boolean onGround = (getY() >= ground);
        if (!onGround)
        {
           Speed++;
           setLocation(getX(), getY()+Speed);
           
            if (getY()==400)
            {
                setLocation(getX(), ground);
           }
        }
        else
        {
            if (Greenfoot.isKeyDown("up"))
            {
              
                Speed = -20;
                setLocation(getX(), getY()+Speed);
                  Greenfoot.playSound("jump.wav");
            }
        }
      }
     public void shoot(){
       if(Greenfoot.isKeyDown("space")){
          setImage("manshoot.png");
            getWorld().addObject(new bullet(),getX(),getY());
            Greenfoot.playSound("shoot.wav");
       }
      }
      int time=5;
      public void touchboum(){
          
            if(isTouching(boum.class)){
                
            setImage("b.png");
            Greenfoot.playSound("boum.wav");
            time--;
            if(time==0){
            Greenfoot.stop();
        
           Greenfoot.setWorld(new scoreboard());
           
        }
            }
        }
        public void delete(){
            if(isTouching(monster.class)){
                heart--;
            if(heart==0){
                Greenfoot.setWorld(new scoreboard());
                Greenfoot.stop();
            }
            
        }
        
       
    
     
        
        }
    }
        
     
    
            
            
            
           
       
    
            
            
    
        
    
    
        
        
        
       
    
        
    
       
        
        
        
        
        
    
    

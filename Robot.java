import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int eatPizza;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        eatFood();
        animate();
       
         if( isTouching (Wall.class))
       {
            setLocation( 100, 50 ); 
       }
         if( isTouching (Bar.class))
       {
            setLocation( 100, 50 ); 
       }
    }
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY()-5);
            animate();
   
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY()+5); 
            animate();
            
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation( getX()-5, getY());
            animate();
            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation( getX()+5, getY());
            animate();
        
        }  
    }
    public void eatFood()
    {
        if (isTouching(Food.class))
          {
          Greenfoot.playSound("eat.wav");
          removeTouching(Food.class);
          eatPizza = eatPizza + 1;
            
            getWorld().showText("Score: " + eatPizza, 50, 510);
          }
    }    
    public void animate()
    {
       if( getImage() == robotimage1 )
          {
            setImage ( robotimage2 );
          }
        else
          {
            setImage ( robotimage1 );
          }
    }
    
}


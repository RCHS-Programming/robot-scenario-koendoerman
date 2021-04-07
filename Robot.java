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
    private int pizzasEaten;
    private int eatPizza;
    private int Lives;
    private int removeLife;
    public void act() 
    {
        eatFood();
        robotMovement();
        detectWallCollision();
        detectBarCollision();
        detectHouse();
        removeLife();
  
    }
    public Robot()
    {
        pizzasEaten = 0;
    }
    public void detectWallCollision()
    {
           if( isTouching (Wall.class))
       {
           Greenfoot.playSound("hurt.wav");  
           setLocation( 100, 50 ); 
       }
    }
    public void detectBarCollision()
    {
          if( isTouching (Bar.class))
       {
           Greenfoot.playSound("hurt.wav"); 
           setLocation( 100, 50 ); 
       }
    }
    public void detectHouse()
    {
          if( isTouching (House.class))
       {
          Greenfoot.playSound("yipee.wav");
          Greenfoot.stop();
        
       }
    }
    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            animate();
            setLocation( getX(), getY()-5);
            
   
        }
        if(Greenfoot.isKeyDown("down"))
        {
            animate();
            setLocation( getX(), getY()+5); 
            
            
        }
        if(Greenfoot.isKeyDown("left"))
        {
            animate();
            setLocation( getX()-5, getY());
            
            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            animate();
            setLocation( getX()+5, getY());
            
        
        }  
    }
    public void eatFood()
    {
        if (isTouching(Food.class))
          {
          Greenfoot.playSound("eat.wav");
          removeTouching(Food.class);
          pizzasEaten = pizzasEaten + 1;
         
          getWorld().showText( "Score: " + pizzasEaten, 100, 370);
            
         
          

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
    public void removeLife()
    {
     
        if( isTouching (Wall.class))
        {
         removeLife = removeLife - 1;   
        }
        if( isTouching (Bar.class))
        {
         removeLife = removeLife - 1;   
        }
 
     
    }
}
    
   

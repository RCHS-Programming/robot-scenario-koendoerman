import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
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
   
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY()+5); 
            
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation( getX()-5, getY());
            
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation( getX()+5, getY());
            
        
        }    
    }
}

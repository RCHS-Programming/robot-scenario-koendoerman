import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject( new Robot(), 100, 50);
        
        addObject( new Wall(), 50, 150);
        addObject( new Wall(), 100, 150);
        addObject( new Wall(), 150, 150);
        addObject( new Wall(), 550, 150);
        addObject( new Wall(), 500, 150);
        
        addObject( new Bar(), 325, 150);
        
        addObject( new House(), 550, 350);
    }
}

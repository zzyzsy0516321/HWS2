import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends World
{

    /**
     * Constructor for objects of class Sky.
     * 
     */
    public Sky()
    {    
        
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Airplane airChina = new Airplane();
        addObject(airChina,300,200);

    }
}

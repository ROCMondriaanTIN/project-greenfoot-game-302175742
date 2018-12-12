import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Einde extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public Einde()
    {    
        super(1000, 800, 1, false);
        this.setBackground("bg.png");
        
        prepare();
    }
    private void prepare()
    {
        Einde1 einde1= new Einde1();
        addObject (einde1, 500, 200);
}
}

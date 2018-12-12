import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Levens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levens extends HUD
{
    /**
     * Act - do whatever the Levens wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List <Hero> hero = getWorld().getObjects(Hero.class);
        getWorld().showText(Double.toString(hero.get(0).hearts()) + "X",930,20);
    }  
    
    public Levens()
    {
        setImage("hud_heartFull.png");
        
    } 
}

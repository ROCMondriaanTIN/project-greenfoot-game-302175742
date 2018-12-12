import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coins extends HUD
{
    /**
     * Act - do whatever the Coins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        List <Hero> hero = getWorld().getObjects(Hero.class);
        getWorld().showText(Integer.toString(hero.get(0).eatCoins()) + "X",930,75);
    }  
    
    public Coins()
    {
        setImage("hud_coins.png");
        
    }
}

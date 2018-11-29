import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Tijd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tijd extends Actor
{
    private int count; // the counter field
    private int initialCount; // the initial time given before event occurs
    private boolean running;
 
    public Tijd()
    {
        this(0, true);
    }
 
    public Tijd(int timeBeforeEvent)
    {
        this(timeBeforeEvent, true);
    }
 
    public Tijd(int timeBeforeEvent, boolean getsStarted) // int value given in seconds
    {
        setTimer(timeBeforeEvent);
        updateImage();
        running = getsStarted;
    }
 
    public void setTimer(int timeBeforeEvent)
    {
        initialCount = 60 * timeBeforeEvent;
        count = -initialCount;
    }
 
    private void updateImage()
    {
        String prefix = "T - ";
        if (count >= 0) prefix = "T + ";
        int time = count * (int)Math.signum(count);
        time = time / 60;
        int secs = time % 60;
        time = (time - secs) / 60;
        int mins = time % 60;
        int hrs = (time - mins) / 24;
        String h = "00"+hrs;
        while (h.length() > 2) h = h.substring(1);
        String m = "00"+mins;
        while (m.length() > 2) m = m.substring(1);
        String s = "00" + secs;
        while (s.length() > 2) s = s.substring(1);
        String text = prefix + h + "h : " + m + "m : " + s + "s";
        setImage("p1_jump.png");
    }
 
    public void act()
    {
        if (running)
        {
            count++;
            if ((count + initialCount) % 60 == 0) updateImage();
        }
    }
 
    public int getTime()
    {
        return count / 60;
    }
 
    public void start()
    {
        running = true;
    }
 
    public void stop()
    {
        running = false;
    }
}

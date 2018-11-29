import greenfoot.*;

/**
*
* @author R. Springer
*/
public class Hero extends Mover {

private final double gravity;
private final double acc;
private final double drag;
private final GreenfootImage staand= new GreenfootImage("staand.png");

private final GreenfootImage loop2= new GreenfootImage("p1_walk01.png");
private final GreenfootImage loop3= new GreenfootImage("p1_walk02.png");
private final GreenfootImage loop4= new GreenfootImage("p1_walk03.png");
private final GreenfootImage loop5= new GreenfootImage("p1_walk04.png");
private final GreenfootImage loop6= new GreenfootImage("p1_walk05.png");
private final GreenfootImage loop7= new GreenfootImage("p1_walk06.png");
private final GreenfootImage loop8= new GreenfootImage("p1_walk07.png");
private final GreenfootImage loop9= new GreenfootImage("p1_walk08.png");
private final GreenfootImage loop10= new GreenfootImage("p1_walk09.png");
private final GreenfootImage loop11= new GreenfootImage("p1_walk10.png");
private final GreenfootImage loop12= new GreenfootImage("p1_walk11.png");
private final GreenfootImage staandinv = new GreenfootImage("staandinv.png");
private final GreenfootImage loopinv1 = new GreenfootImage("p1_rotate01.png");
private final GreenfootImage loopinv3 = new GreenfootImage("p1_rotate02.png");
private final GreenfootImage loopinv4 = new GreenfootImage("p1_rotate03.png");
private final GreenfootImage loopinv5 = new GreenfootImage("p1_rotate04.png");
private final GreenfootImage loopinv6 = new GreenfootImage("p1_rotate05.png");
private final GreenfootImage loopinv7 = new GreenfootImage("p1_rotate06.png");
private final GreenfootImage loopinv8 = new GreenfootImage("p1_rotate07.png");
private final GreenfootImage loopinv9 = new GreenfootImage("p1_rotate08.png");
private final GreenfootImage loopinv10 = new GreenfootImage("p1_rotate09.png");
private final GreenfootImage loopinv11 = new GreenfootImage("p1_rotate10.png");
private final GreenfootImage loopinv2 = new GreenfootImage("p1_rotate11.png");
private final GreenfootImage jump = new GreenfootImage("p1_jump.png");
private final GreenfootImage springen = new GreenfootImage("springen.png");


private int speed = 3;
private int frame;
private boolean lopen;
private boolean Kijkenrechts;
private boolean isKeyPressed;



public  boolean key = false;
public boolean door = false;
public  boolean openDeur1 = false;
public  boolean touchDeur1 = false;

public Hero() {
    super();
    
    gravity = 9.8;
    acc = 0.6;
    drag = 0.8;
    setImage("staand.png");
    
    setImage(jump);
    lopen = false;
    Kijkenrechts = true;

    staand.scale(70,100);
    loop2.scale(70,100);
    loop3.scale(70,100);
    loop4.scale(70,100);
    loop5.scale(70,100);
    loop6.scale(70,100);
    loop7.scale(70,100);
    loop8.scale(70,100);
    loop9.scale(70,100);
    loop10.scale(70,100);
    loop11.scale(70,100);

    jump.scale(70,100);
    loopinv1.scale(70,100);
    loopinv2.scale(70,100);
    loopinv3.scale(70,100);
    loopinv4.scale(70,100);
    loopinv5.scale(70,100);
    loopinv6.scale(70,100);
    loopinv7.scale(70,100);
    loopinv8.scale(70,100);
    loopinv9.scale(70,100);
    loopinv10.scale(70,100);
    loopinv11.scale(70,100);
}

@Override
public void act() {
    handleInput();
    
    {
    checkKeys();
    onGround();
    }
    
    velocityX *= drag;
    velocityY += acc;
    if (velocityY > gravity) {
        velocityY = gravity;
    }
    applyVelocity();
    
    
   
    
    

    for (Actor enemy : getIntersectingObjects(Enemy.class)) {
        if (enemy != null) {
            //getWorld().removeObject(this);
           setLocation(400, 1100);
            break;
        }
    }
    for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
        if (enemy != null) {
            //getWorld().removeObject(this);
           setLocation(300, 700);
            return;
        }
    
    }
    for(Actor enemy : getIntersectingObjects(Water.class)){
        if(enemy != null){
            getWorld().removeObject(this);
            setLocation(300, 700);
            return;
        }
    }
        
    
    
    
    

}
        public void checkKeys()
{
    isKeyPressed = false;
    if (Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("a"))
    {
        stoplopen();
        isKeyPressed = true;
    }
    else if (Greenfoot.isKeyDown("d"))
    {
        walkRight();
        setLocation (getX()+speed, getY());
        isKeyPressed = true;
    }
    else if (Greenfoot.isKeyDown("a"))
    {
        walkLeft();
        setLocation (getX()-speed, getY());
        isKeyPressed = true;
    }
    if (!(isKeyPressed))
    {
        stoplopen();
    }
}


public boolean onGround()
{
    Actor under = getOneObjectAtOffset (0, getHeight ()/2, Tile.class);
    Tile tile = (Tile) under;
    return tile != null && tile.isSolid == true; 
} 




public void handleInput() {
    if ((Greenfoot.isKeyDown("w") && onGround() == true ) ||(Greenfoot.isKeyDown("w") && isTouching(Ladder.class)) || (Greenfoot.isKeyDown("w") &&  isTouching(RopeAttached.class)) || (Greenfoot.isKeyDown("w") && isTouching(RopeVertical.class)))
    
        {
        setImage("springen.png");
            velocityY = -15;
        
        }
        if (velocityY != -5);
        {
            setImage("springen.png");
        }
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -4;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 4;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
 
    public void walkRight()
    {
        lopen = true;
        Kijkenrechts = true;
        frame ++;
        if(frame==1)
        {
            setImage(staand);
        }
        else if(frame==2)
        {
            setImage(loop12);
        }
        else if(frame==3)
        {
            setImage(loop2);
        }
        else if(frame==4)
        {
            setImage(loop3);
        }
        else if(frame==5)
        {
            setImage(loop4);
        }
        else if(frame==6)
        {
            setImage(loop5);
        }
        else if(frame==7)
        {
            setImage(loop6);
        }
        else if(frame==8)
        {
            setImage(loop7);
        }
        else if(frame==9)
        {
            setImage(loop8);
        }
        else if(frame==10)
        {
            setImage(loop9);
        }
        else if(frame==11)
        {
            
            setImage(loop11);
            frame = 1;
            return;
        }
    }
    
    public void walkLeft()
    {
        lopen = true;
        Kijkenrechts = false;
        frame ++;
        if(frame==1)
        {
            setImage(staand);
        }
        else if(frame==2)
        {
            setImage(loopinv1);
        }
        else if(frame==3)
        {
            setImage(loopinv2);
        }
        else if(frame==4)
        {
            setImage(loopinv3);
        }
        else if(frame==5)
        {
            setImage(loopinv4);
        }
       else if(frame==6)
        {
            setImage(loopinv5);
        }
        else if(frame==7)
        {
            setImage(loopinv6);
        }
        else if(frame==8)
        {
            setImage(loopinv7);
        }
        else if(frame==9)
        {
            setImage(loopinv8);
        }
        else if(frame==10)
        {
            setImage(loopinv9);
        }
        else if(frame==11)
        {
            setImage(loopinv10);
        }
        else if (frame==12)
        {
            setImage(loopinv11);
            frame = 1;
            return;
        }
    }
 
    public void stoplopen()
    {
        lopen = false;
        if (Kijkenrechts)
            setImage (staand);
        else
            setImage (staandinv);
        }

    
    public String positie()
{
String a= "x" +getX()+"y"+getY();
return a;
}
}


    






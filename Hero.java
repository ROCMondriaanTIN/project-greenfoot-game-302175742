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

 private final GreenfootImage RMidle= new GreenfootImage("p123.png");
    private final GreenfootImage RMjump= new GreenfootImage("p1_jump.png");
    private final GreenfootImage RMwalk1= new GreenfootImage("p1_walk01.png");
    private final GreenfootImage RMwalk2= new GreenfootImage("p1_walk02.png");
    private final GreenfootImage RMwalk3= new GreenfootImage("p1_walk03.png");
    private final GreenfootImage RMwalk4= new GreenfootImage("p1_walk04.png");
    private final GreenfootImage RMwalk5= new GreenfootImage("p1_walk05.png");
    private final GreenfootImage RMwalk6= new GreenfootImage("p1_walk06.png");
    private final GreenfootImage RMwalk7= new GreenfootImage("p1_walk07.png");
    private final GreenfootImage RMwalk8= new GreenfootImage("p1_walk08.png");
    private final GreenfootImage RMwalk9= new GreenfootImage("p1_walk09.png");
    private final GreenfootImage RMwalk10= new GreenfootImage("p1_walk10.png");
    private final GreenfootImage RMwalk11= new GreenfootImage("p1_walk11.png");
 
    private final GreenfootImage LMidle = new GreenfootImage("p123inv.png");
    private final GreenfootImage LMjump = new GreenfootImage(RMjump);
    private final GreenfootImage LMwalk1 = new GreenfootImage("p1inv_walk01.png");
    private final GreenfootImage LMwalk2 = new GreenfootImage("p1inv_walk02.png");
    private final GreenfootImage LMwalk3 = new GreenfootImage("p1inv_walk03.png");
    private final GreenfootImage LMwalk4 = new GreenfootImage("p1inv_walk04.png");
    private final GreenfootImage LMwalk5 = new GreenfootImage("p1inv_walk05.png");
    private final GreenfootImage LMwalk6 = new GreenfootImage("p1inv_walk06.png");
    private final GreenfootImage LMwalk7 = new GreenfootImage("p1inv_walk07.png");
    private final GreenfootImage LMwalk8 = new GreenfootImage("p1inv_walk08.png");
    private final GreenfootImage LMwalk9 = new GreenfootImage("p1inv_walk09.png");
    private final GreenfootImage LMwalk10 = new GreenfootImage("p1inv_walk10.png");
    private final GreenfootImage LMwalk11 = new GreenfootImage("p1inv_walk11.png");
 


public int checkpoint = 0;
private int speed = 3;
private int frame;
private boolean lopen;
private boolean Kijkenrechts;
private boolean isKeyPressed;
public int x;
public int y;



public  boolean key = false;
public boolean door = false;
public  boolean openDeur1 = false;
public  boolean touchDeur1 = false;
public static double levens = 2;
public static int munten;
public boolean munten2;
public String worldName;
boolean isDood=false;
boolean removedBadGuy=false;
public String actieveWereld;

public Hero() {
    super();
    
    gravity = 9.8;
    acc = 0.6;
    drag = 0.8;
    setImage("p123.png");
    
    this.worldName= worldName;
        
        setImage(RMidle);
        lopen = false;
        Kijkenrechts = true;
 
        RMidle.scale(70,100);
        RMjump.scale(70,100);
        RMwalk1.scale(70,100);
        RMwalk2.scale(70,100);
        RMwalk3.scale(70,100);
        RMwalk4.scale(70,100);
        RMwalk5.scale(70,100);
        RMwalk6.scale(70,100);
        RMwalk7.scale(70,100);
        RMwalk8.scale(70,100);
        RMwalk9.scale(70,100);
        RMwalk10.scale(70,100);
        RMwalk11.scale(70,100);
 
        LMidle.scale(70,100);
        LMjump.scale(70,100);
        LMwalk1.scale(70,100);
        LMwalk2.scale(70,100);
        LMwalk3.scale(70,100);
        LMwalk4.scale(70,100);
        LMwalk5.scale(70,100);
        LMwalk6.scale(70,100);
        LMwalk7.scale(70,100);
        LMwalk8.scale(70,100);
        LMwalk9.scale(70,100);
        LMwalk10.scale(70,100);
        LMwalk11.scale(70,100);
}

@Override
public void act() {
    handleInput();
    
    {
    checkKeys();
    onGround();
    }
    getWorld().showText(getX() + "," + getY(),500,50);
    velocityX *= drag;
    velocityY += acc;
    if (velocityY > gravity) {
        velocityY = gravity;
    }
    applyVelocity();
    openDeur1();
    eatCoins();
    
    
   
    
    
//doodgaan door
    for (Actor enemy : getIntersectingObjects(Enemy.class)) {
        if (enemy != null) {
            //getWorld().removeObject(this);
           
            respawn();
            break;
        }
    }
    for (Actor enemy : getIntersectingObjects(LavaTile.class)) {
        if (enemy != null) {
            //getWorld().removeObject(this);
           
            respawn();
            return;
        }
    
    }
    for(Actor enemy : getIntersectingObjects(Water.class)){
        if(enemy != null){
            getWorld().removeObject(this);
            
            respawn();
            return;
        }
    }
    for (Actor enemy : getIntersectingObjects(Death.class)) {
            if (enemy != null) {
                
                respawn();
                
                break;
            }
        }    
    for ( Actor enemy: getIntersectingObjects(Death.class)){
        if(enemy != null){
            
            respawn();
            
            return;
        }
    
    
    

}
}
//wereld naam aangeven
public void wereld()
{
    if(worldName == "MyWorld"){
    String actieveWereld="MyWorld"; 
    }
    else {
     String actieveWereld="Level2";    
    }
    }
    // respawn methode met gameover scherm en checkpoints
public  void respawn()
{
    
    if (levens == 0 )
    {
        Greenfoot.setWorld(new GameOver());
    }
    else {
    if(checkpoint == 1){
    setLocation(2785, 1990);
    }
    else if (checkpoint == 2){
    setLocation(500, 500);
    }
    else if (checkpoint == 3){
    setLocation(500, 500);
    }
    else if (checkpoint == 4){
    setLocation(500, 500);
    }
    else
    {
    setLocation(87, 2890);
}
}
levens = levens -1;
levens = levens + 0.5;
}
//checkpoint waardes aangeven
public void checkpoints()
{
    if(isTouching(Checkpoint.class))
    {
        checkpoint = 1;
    }
    if(isTouching(Checkpoint2.class))
    {
        checkpoint = 2;
    }
    if(isTouching(Checkpoint3.class))
    {
        checkpoint = 3;
    }
    if(isTouching(Checkpoint4.class))
    {
        checkpoint = 4;
    }
    }
    //levens
   public double hearts(){
       levens = levens;
       return levens;
       
       
    }
//de death methode zodat alles onder 1 ding valt
public void Death()
{
    if (isTouching(LavaTile.class))
    {
        respawn();
        
    }
    if(isTouching(Water.class))
    {
        respawn();
    }
}
//checkpoint1 methode voor de checkpoint
public void  checkpoint1()
    {
        setLocation(142,5473);
        
    }
    // positie methode voor informatie doorgeven
    public String positie()
    {
    String a= "X"+getX()+"Y"+getY();    
    
    return a;
    }
    //checkpoint methode om achter de coordinaten te komen
    public void checkpoint()
    {
        if (isTouching(Checkpoint.class))
        {
        x=getX();
        y=getY();
        
        }
    }
//methode om coins weg te halen
    public int  eatCoins()
        {
       Actor Coin = getOneIntersectingObject(Coin.class);
       if(isTouching(Coin.class))
            {
        removeTouching(Coin.class);
        munten = munten + 1;
        
        }
          return munten;
        }
//methode om de knoppen van het toetsenboord te controleren
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
    else if (Greenfoot.isKeyDown("spacebar"))
    {
        respawn();
    }
    if (!(isKeyPressed))
    {
        stoplopen();
    }
}

public boolean openDeur1()
    {
        if (isTouching(Deur1.class))
        {
            openDeur1 = true;
            Greenfoot.setWorld(new Level2());
        }
            if ( isTouching(Deur2.class))
        {
            Greenfoot.setWorld(new Einde());
        }
        return openDeur1;
        
    
    
    
    
}
public boolean getOpenDeur()
     {
         return openDeur1;
        }
        
public boolean onGround()
{
    Actor under = getOneObjectAtOffset (0, getHeight ()/2, Tile.class);
    Tile tile = (Tile) under;
    return tile != null && tile.isSolid == true; 
} 

public void removeBadGuy()
      {
            if(isTouching(BadGuy.class)) 
            {
                    removeTouching(BadGuy.class); 
		    removedBadGuy=true;

                    
                return;
                }
        }




public void handleInput() {
    if ((Greenfoot.isKeyDown("w") && onGround() == true ) ||(Greenfoot.isKeyDown("w") && isTouching(JumpTile.class)))
    
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
            setImage(RMidle);
        }
        else if(frame==2)
        {
            setImage(RMwalk1);
        }
        else if(frame==3)
        {
            setImage(RMwalk2);
        }
        else if(frame==4)
        {
            setImage(RMwalk3);
        }
        else if(frame==5)
        {
            setImage(RMwalk4);
        }
        else if(frame==6)
        {
            setImage(RMwalk5);
        }
        else if(frame==7)
        {
            setImage(RMwalk6);
        }
        else if(frame==8)
        {
            setImage(RMwalk7);
        }
        else if(frame==9)
        {
            setImage(RMwalk8);
        }
        else if(frame==10)
        {
            setImage(RMwalk9);
        }
        else if(frame==11)
        {
            setImage(RMwalk10);
        }
        else if (frame==12){
            setImage(RMwalk11);
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
            setImage(LMidle);
        }
        else if(frame==2)
        {
            setImage(LMwalk1);
        }
        else if(frame==3)
        {
            setImage(LMwalk2);
        }
        else if(frame==4)
        {
            setImage(LMwalk3);
        }
        else if(frame==5)
        {
            setImage(LMwalk4);
        }
       else if(frame==6)
        {
            setImage(LMwalk5);
        }
        else if(frame==7)
        {
            setImage(LMwalk6);
        }
        else if(frame==8)
        {
            setImage(LMwalk7);
        }
        else if(frame==9)
        {
            setImage(LMwalk8);
        }
        else if(frame==10)
        {
            setImage(LMwalk9);
        }
        else if(frame==11)
        {
            setImage(LMwalk10);
        }
        else if (frame==12)
        {
            setImage(LMwalk11);
            frame = 1;
            return;
        }
    }
 
    public void stoplopen()
    {
        lopen = false;
        if (Kijkenrechts)
            setImage (RMidle);
        else
            setImage (LMidle);
        }
        
    
 public String position()
 {
 String a= "x" +getX()+"y"+getY();
 return a;
 }
}
 
 



    






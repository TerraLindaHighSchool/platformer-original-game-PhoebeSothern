import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level4.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class,Obstacle.class, Platform.class, Collectable.class, Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1140,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,43,760);
        addObject(new Floor(), 600, 800);
        SmallCloud smallCloud = new SmallCloud();
        addObject(smallCloud,124,600);
        BigCloud bigCloud = new BigCloud();
        addObject(bigCloud,235,586);
        BigCloud bigCloud2 = new BigCloud();
        addObject(bigCloud2,348,586);
        TrapDoor trapDoor = new TrapDoor();
        addObject(trapDoor,969,692);
        BigCloud bigCloud3 = new BigCloud();
        addObject(bigCloud3,1084,678);
        SmallCloud smallCloud2 = new SmallCloud();
        addObject(smallCloud2,872,557);
        SmallCloud smallCloud3 = new SmallCloud();
        addObject(smallCloud3,760,557);
        SmallCloud smallCloud4 = new SmallCloud();
        addObject(smallCloud4,770,428);
        BigCloud bigCloud4 = new BigCloud();
        addObject(bigCloud4,655,415);
        SmallCloud smallCloud5 = new SmallCloud();
        addObject(smallCloud5,541,428);
        BigCloud bigCloud5 = new BigCloud();
        addObject(bigCloud5,399,334);
        SmallCloud smallCloud6 = new SmallCloud();
        addObject(smallCloud6,100,186);
        SmallCloud smallCloud7 = new SmallCloud();
        addObject(smallCloud7,215,186);
        BigCloud bigCloud6 = new BigCloud();
        addObject(bigCloud6,326,172);
        SmallCloud smallCloud8 = new SmallCloud();
        addObject(smallCloud8,786,228);
        SmallCloud smallCloud9 = new SmallCloud();
        addObject(smallCloud9,1161,102);
        SmallCloud smallCloud10 = new SmallCloud();
        addObject(smallCloud10,1045,102);
        SmallCloud smallCloud11 = new SmallCloud();
        addObject(smallCloud11,932,102);
        Bomb bomb = new Bomb();
        addObject(bomb,655,358);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,211,140);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}

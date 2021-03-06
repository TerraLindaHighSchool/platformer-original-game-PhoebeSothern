import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class, Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,43,760);
        addObject(new Floor(), 600, 800);
        SmallCloud smallCloud = new SmallCloud();
        addObject(smallCloud,199,678);
        SmallCloud smallCloud2 = new SmallCloud();
        addObject(smallCloud2,407,522);
        SmallCloud smallCloud3 = new SmallCloud();
        addObject(smallCloud3,792,680);
        TrapDoor trapDoor = new TrapDoor();
        addObject(trapDoor,676,680);
        BigCloud bigCloud = new BigCloud();
        addObject(bigCloud,908,667);
        SmallCloud smallCloud4 = new SmallCloud();
        addObject(smallCloud4,1021,680);
        smallCloud4.setLocation(1018,680);
        BigCloud bigCloud2 = new BigCloud();
        addObject(bigCloud2,500,508);;
        SmallCloud smallCloud5 = new SmallCloud();
        addObject(smallCloud5,848,411);
        TrapDoor trapDoor2 = new TrapDoor();
        addObject(trapDoor2,1064,100);
        SmallCloud smallCloud6 = new SmallCloud();
        addObject(smallCloud6,1174,100);
        SmallCloud smallCloud7 = new SmallCloud();
        addObject(smallCloud7,956,100);
        SmallCloud smallCloud8 = new SmallCloud();
        addObject(smallCloud8,589,213);
        BigCloud bigCloud3 = new BigCloud();
        addObject(bigCloud3,478,200);
        SmallCloud smallCloud9 = new SmallCloud();
        addObject(smallCloud9,364,213);
        SmallCloud smallCloud10 = new SmallCloud();
        addObject(smallCloud10,249,213);
        SmallCloud smallCloud11 = new SmallCloud();
        addObject(smallCloud11,88,352);
        SmallCloud smallCloud12 = new SmallCloud();
        addObject(smallCloud12,191,60);
        Bomb bomb = new Bomb();
        addObject(bomb,907,608);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,88,305);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,476,142);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
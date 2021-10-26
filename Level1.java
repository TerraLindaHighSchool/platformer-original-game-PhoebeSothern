import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
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
        Bomb bomb = new Bomb();
        addObject(bomb,928,610);
        SmallCloud SmallCloud = new SmallCloud();
        addObject(SmallCloud,820,680);
        SmallCloud SmallCloud2 = new SmallCloud();
        BigCloud BigCloud = new BigCloud();
        addObject(BigCloud,925,667);
        TrapDoor trapDoor = new TrapDoor();
        addObject(trapDoor,1030,680);
        addObject(SmallCloud2,90,533);
        BigCloud BigCloud2 = new BigCloud();
        addObject(BigCloud2,200,520);
        BigCloud BigCloud3 = new BigCloud();
        addObject(BigCloud3,310,520);
        TrapDoor trapDoor2 = new TrapDoor();
        addObject(trapDoor2,420,533);
        TrapDoor trapDoor3 = new TrapDoor();
        addObject(trapDoor3,275,620);
        SmallCloud SmallCloud3 = new SmallCloud();
        addObject(SmallCloud3,1015,465);
        SmallCloud SmallCloud4 = new SmallCloud();
        addObject(SmallCloud4,828,337);
        BigCloud BigCloud4 = new BigCloud();
        addObject(BigCloud4,724,323);
        SmallCloud SmallCloud5 = new SmallCloud();
        addObject(SmallCloud5,410,235);
        SmallCloud SmallCloud6 = new SmallCloud();
        addObject(SmallCloud6,310,235);
        SmallCloud SmallCloud7 = new SmallCloud();
        addObject(SmallCloud7,105,85);
        SmallCloud SmallCloud8 = new SmallCloud();
        addObject(SmallCloud8,550,120);
        SmallCloud SmallCloud9 = new SmallCloud();
        addObject(SmallCloud9,1147,110);
        SmallCloud SmallCloud10 = new SmallCloud();
        addObject(SmallCloud10,1045,110);
        SmallCloud SmallCloud11 = new SmallCloud();
        addObject(SmallCloud11,940,110);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,310,461);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,549,72);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}

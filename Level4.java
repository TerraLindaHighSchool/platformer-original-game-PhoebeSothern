import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level4()
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
        addObject(smallCloud,183,676);
        BigCloud bigCloud = new BigCloud();
        addObject(bigCloud,95,548);
        BigCloud bigCloud2 = new BigCloud();
        addObject(bigCloud2,207,548);
        SmallCloud smallCloud2 = new SmallCloud();
        addObject(smallCloud2,318,562);
        SmallCloud smallCloud3 = new SmallCloud();
        addObject(smallCloud3,1,562);
        SmallCloud smallCloud4 = new SmallCloud();
        addObject(smallCloud4,553,645);
        BigCloud bigCloud3 = new BigCloud();
        addObject(bigCloud3,667,632);
        SmallCloud smallCloud5 = new SmallCloud();
        addObject(smallCloud5,779,645);
        SmallCloud smallCloud6 = new SmallCloud();
        addObject(smallCloud6,1013,537);
        SmallCloud smallCloud7 = new SmallCloud();
        addObject(smallCloud7,705,428);
        BigCloud bigCloud4 = new BigCloud();
        addObject(bigCloud4,600,414);
        SmallCloud smallCloud8 = new SmallCloud();
        addObject(smallCloud8,394,281);
        SmallCloud smallCloud9 = new SmallCloud();
        addObject(smallCloud9,278,281);
        SmallCloud smallCloud10 = new SmallCloud();
        addObject(smallCloud10,652,147);
        SmallCloud smallCloud11 = new SmallCloud();
        addObject(smallCloud11,1147,111);
        SmallCloud smallCloud12 = new SmallCloud();
        addObject(smallCloud12,1032,111);
        SmallCloud smallCloud13 = new SmallCloud();
        addObject(smallCloud13,917,111);
        SmallCloud smallCloud14 = new SmallCloud();
        addObject(smallCloud14,158,88);
        Bomb bomb = new Bomb();
        addObject(bomb,669,576);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,272,236);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
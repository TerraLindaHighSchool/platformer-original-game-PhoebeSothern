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
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class, Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1171,44);
        Player player = new Player(3,5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
        addObject(player,43,760);
        addObject(new Floor(), 600, 800);
        addObject(new SmallBrickWall(), 250, 550);
        addObject(new SmallBrickWall(), 150, 550);
        addObject(new SmallBrickWall(), 450, 650);
        addObject(new SmallBrickWall(), 550, 650);
        addObject(new TrapDoor(GRAVITY), 650, 650);
        addObject(new TrapDoor(GRAVITY), 400, 450);
        addObject(new SmallBrickWall(), 100, 350);
        addObject(new SmallBrickWall(), 300, 200);
        addObject(new SmallBrickWall(), 420, 200);
        addObject(new SmallBrickWall(), 800, 480);
        addObject(new TrapDoor(GRAVITY), 900, 480);
        addObject(new SmallBrickWall(), 1000, 480);
        addObject(new BrickWall(), 1100,100);
        addObject(new BrickWall(), 840,250);
        addObject(new Bomb(GRAVITY), 115,507);
        addObject(new Bomb(GRAVITY), 875,207);
        addObject(new Bomb(GRAVITY), 555,607);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}

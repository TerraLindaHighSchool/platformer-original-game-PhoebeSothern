import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Obstacle
{
    private float yVelocity;

    public void act()
    {
        
    }
    
    // Causes the object to fall onto a platform below protected void fall()
    protected void fall()
    {
        if(!isOnGround())
        {
            setLocation(getX(), getY() + (int) yVelocity);
        }
    }
}

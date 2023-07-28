import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class knight extends Actor
{
    /**
     * Act - do whatever the knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public knight()
    {
        getImage().scale(50,50);
    }
    public void act()
    {
       moveAround();
       youLose();
       youWin();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("a"))
            setLocation(getX()-5, getY());
        if (Greenfoot.isKeyDown("d"))
            setLocation(getX()+5, getY());
        if (Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+5);
        if (Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-5);
    }
    public void youLose()
    {
        if(isTouching(Enemy.class) && !isTouching(Log.class)){
        Greenfoot.playSound("au.mp3");
        getWorld().showText("YOU LOOSE!!", 350,50);
        Greenfoot.stop();
        
    }
        }
    
    public void youWin()
    {
        if(getY()<60){
            getWorld().showText ("YOU WIN!!", getWorld(). getWidth() /2,50);
            Greenfoot.stop();
            
        }  
    }
    

    }



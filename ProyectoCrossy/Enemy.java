import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count= 0;
    String enemyName;
    public Enemy(String enemyName)
    {
        this.enemyName = enemyName;
        setImage(this.enemyName);
        getImage().scale(50,50);
    }
    public void act()
    {   count++;
        if(count % 20 == 0 && this.enemyName == "witch.png")
        {
            setLocation(getX()- 10,getY()); 
        }
        if(count % 20 == 0 && this.enemyName == "Goblin.png")
        {
            setLocation(getX()+ 15,getY()); 
        }
        if(count % 20 == 0 && this.enemyName == "Minotauro.png")
        {
            setLocation(getX()- 5,getY()); 
        }
        if(getX()==0)
        setLocation(getWorld().getWidth()-2,getY());
        if(getX() == getWorld().getWidth()-1)
        setLocation(1,getY());
    }
}

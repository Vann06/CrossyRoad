import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends Actor
{
    /**
     * Act - do whatever the Log wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count= 0;
    String logName;
    public Log(String logName)
    {
        this.logName = logName;
        setImage(this.logName);
        getImage().scale(50,50);
    
    }
    
    public void act()
    {
        count++;
        if(count % 20 == 0 && this.logName == "log.png"){
            setLocation(getX()- 20,getY()); 
        }
        if(getX()==0)
        setLocation(getWorld().getWidth()-2,getY());
        if(getX() == getWorld().getWidth()-1)
        setLocation(1,getY());
        
    }
}

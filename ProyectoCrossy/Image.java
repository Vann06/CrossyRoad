import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image extends Actor
{
    /**
     * Act - do whatever the Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String imageName;
    public Image(String imageName){
        this.imageName = imageName;
        setImage(this.imageName);
        getImage().scale(50,50);
    }
    public void act()
    {
        // Add your action code here.
    }
}

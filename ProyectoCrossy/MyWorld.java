 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World

{
    GreenfootSound myMusic = new GreenfootSound ( "Musicon.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int [][] map= 
               {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,3,3,3,3,1,1,3,3,3,3,1,1,3,3,1},
                {7,7,7,1,1,7,7,7,1,1,1,7,7,7,1,1},
                {1,1,1,1,1,1,3,3,3,1,1,3,3,1,1,3},
                {1,7,7,7,1,1,1,1,7,7,7,1,1,1,1,1},
                {1,1,1,1,3,3,1,1,1,1,1,3,3,3,3,1},
                {1,7,7,7,1,1,1,1,7,7,7,1,1,7,7,1},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {2,2,2,2,2,2,2,2,6,6,6,2,2,4,4,2},
                {2,2,4,4,4,2,2,2,2,2,2,4,4,2,2,2},
                {2,5,5,2,2,2,2,5,5,2,2,2,2,2,2,2},
                {2,2,6,6,6,2,2,4,4,2,2,4,4,4,2,2},
                {2,5,5,5,2,2,5,5,5,2,2,2,2,2,2,2},
                {2,2,4,4,2,2,2,6,6,2,2,2,6,6,2,2},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        for(int row= 0; row<16; row++)
            for(int col =0; col <16; col++)
                if (map [row][col] == 0)
                    addObject(new Image("grass.jpg"),col * 50,row * 50 );
                else if(map[row][col] == 1)
                    addObject(new Enemy("water.jpg"), col*50, row*50);
                else if(map[row][col] == 2)
                    addObject(new Image("sand.jpg"), col*50, row*50);
                else if(map[row][col] == 3){
                    addObject(new Enemy("water.jpg"), col*50, row*50);
                    addObject(new Log("log.png"),col*50, row*50);
               
                }
                else if(map[row][col]== 4){
                    addObject(new Image("sand.jpg"), col*50, row*50);
                    addObject(new Enemy("witch.png"),col*50, row*50);
                    
                }
                else if(map[row][col] == 5){
                    addObject(new Image("sand.jpg"), col*50, row*50);
                    addObject(new Enemy("Goblin.png"), col*50, row*50);

                }
                else if(map[row][col] == 6){
                    addObject(new Image("sand.jpg"), col*50, row*50);
                    addObject(new Enemy("Minotauro.png"), col*50, row*50);

                }
                else if(map[row][col] == 7){
                    addObject(new Enemy("water.jpg"), col*50, row*50);
                    addObject(new Log("turtle.png"),col*50, row*50);
               
                }
                
                    //else if(map[row][col] == 4])
                //else if(map[row][col] == 5])
                //else if(map[row][col] == 6])
                //else if(map[row][col] == 7])
                //else if(map[row][col] == 8])
                addObject(new knight(),375,720);
                setPaintOrder(knight.class,Log.class, Enemy.class);

            
    }
    public void act()
    {
        myMusic.play();
    }
    
    
}

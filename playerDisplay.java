import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 this just displays text when checkmate is achieved.
 */

public class playerDisplay extends Actor
{
    private int player = 1;
    
    
    
    public void act() 
    {
        if(Piece.globalPlayer == 1){
            player = 1;
        }
        else{
            player = 2;
        }
       GreenfootImage image = new GreenfootImage("Player"+player, 24, 
       Color.BLACK,null);
       setImage(image);
    }    
    
}

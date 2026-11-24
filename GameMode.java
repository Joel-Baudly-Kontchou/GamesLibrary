
/**
 * Write a description of class GameMode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameMode extends Game
{
    // instance variables - replace the example below with your own
    private String mode;
    
    public GameMode(String title, int AgeRating, int Rating, String platform, String mode)
    {
        super(title, AgeRating, Rating, platform); 
        this.mode = mode;
    }
}
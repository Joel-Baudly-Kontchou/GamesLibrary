
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private int AgeRating; 
    protected double Rating;
    private String platform; 

    /**
     * Constructor for objects of class Game
     */
    public Game(String title, int AgeRating, double Rating, String platform)
    {
          this.title = title; 
          this.AgeRating = AgeRating; 
          this.Rating = Rating; 
          this.platform = platform;
    }
    
    public String getTitle(){
        return title; 
    }
    
    public void setRating(int newRating){
        Rating = newRating; 
    }
    
    public void getDetails()
    {
        System.out.println("Title:" + title); 
        System.out.println("AgeRating:" + AgeRating);
        System.out.println("Rating:" + Rating); 
        System.out.println("Platform:" + platform);
    }
}
import java.util.ArrayList;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GamesLibrary
{
    // instance variables - replace the example below with your own
    private ArrayList<Game> games;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GamesLibrary()
    {
        games = new ArrayList<>(); 
    }
    
    public void listGames(){
        for(Game g : games){
            g.getDetails();
        }
    }
    
    public void topRated(){
        
    }
    
    public void addGame(Game g){
            games.add(g);
    }
    
    public void rateGame(String title, double newRating){
        for(Game g : games){
            if(g.getTitle().equals(title)){
                g.Rating = newRating; 
                
                break;
            }
        }
    }
    
    public void removeGame(){
        
    }
}

/**
 * Write a description of class GameSession here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSession
{
    // instance variables - replace the example below with your own
    private double startTime; 
    private double endTime; 
    private double duration; 

    /**
     * Constructor for objects of class GameSession
     */
    public GameSession(double startTime, double endTime)
    {
       this.startTime = startTime; 
       this.endTime = endTime; 
       this.duration = endTime - startTime; 
    }
    
    public void startTime(){
        System.out.println("Game Started at:" + startTime);
    }
    
    public void endTime(){
        System.out.println("Game Ended at:" + endTime);
        System.out.println("Duration:" + duration); 
    }
}
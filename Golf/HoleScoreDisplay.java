package Golf;

public class HoleScoreDisplay implements Observer {
    
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
    }
    
    public String toString(){
        if (this.strokes > this.par){
            return "Current Hole stats: Par (" + Integer.toString(this.par) + ") Strokes (" + Integer.toString(this.strokes) + "), " + (this.strokes - this.par) + " over par";
        }
        return "Current Hole stats: Par (" + Integer.toString(this.par) + ") Strokes (" + Integer.toString(this.strokes) + "), Making par";
        
    }
    
}

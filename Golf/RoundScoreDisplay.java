package Golf;

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal = 0;
    private int parTotal = 0;

    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par){
        this.strokesTotal += strokes;
        this.parTotal += par;

    }
    public String toString(){
        if (this.strokesTotal > this.parTotal){
            return "Overall stats: Par (" + Integer.toString(this.parTotal) + ") Strokes (" + Integer.toString(this.strokesTotal) + "), " + (this.strokesTotal - this.parTotal) + " over par";
        }
        return "Overall stats: Par (" + Integer.toString(this.parTotal) + ") Strokes (" + Integer.toString(this.strokesTotal) + "), Making par";
    }
    
}
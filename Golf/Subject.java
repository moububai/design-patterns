package Golf;

interface Subject{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(int strokes, int par);
}

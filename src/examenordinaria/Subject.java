package examenordinaria;

public interface Subject {
    public void addObserver(Observer o);
    public void notifyObservers();
    public void addBid(Observer b, double d);
    
}

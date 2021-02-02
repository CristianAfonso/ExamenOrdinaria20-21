package examenordinaria;

public class Bid {
    
    private Observer observer;
    private double bidAmount;
    
    public Bid(Observer o, Double bidAmount){
        this.observer = o;
        this.bidAmount = bidAmount;
    }
    
    public Observer getObserver(){
        return this.observer;
    }
    public double getBidAmount() {
        return this.bidAmount;
    }
    
}

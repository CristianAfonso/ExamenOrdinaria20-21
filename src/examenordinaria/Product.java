package examenordinaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Product implements Subject{
    
    private String productName;
    private String productDescription;
    private double initialBid;
    private Bid higherBid;
    private ArrayList<String> productImages = new ArrayList<String>();
    private ArrayList<Bid> bidList = new ArrayList<Bid>();
    private HashMap<String,Observer> observerList = new HashMap<String, Observer>();
    
    public Product(String productName, String productDescription, double initialBid, Observer o){
        this.productName = productName;
        this.productDescription = productDescription;
        this.initialBid=initialBid;
        this.higherBid= new Bid(o,initialBid);
        this.addBid(higherBid.getObserver(),higherBid.getBidAmount());
    }
    
    
    
    @Override
    public void addObserver(Observer o) {
        observerList.put(o.getUserName(), o);
    }

    @Override
    public void notifyObservers() {
        for (Iterator<String> it = observerList.keySet().iterator(); it.hasNext();) {
            String actual = it.next();
            if(!observerList.get(actual).equals(this.higherBid.getObserver())){
                observerList.get(actual).update(this.higherBid);
            }
        }
    }
    @Override
    public void addBid(Observer b, double d) {
        this.higherBid = new Bid(b, d);
        this.addObserver(b);
        bidList.add(higherBid);
        this.notifyObservers();
    }
    
    public void setPhoto(String photo){
        this.productImages.add(photo);      //Hago referencia a las fotos como si fueran strings, con mas tiempo de implementación y si fuera requerido las hubiera añadido como tal.
    }
    
    public Bid getHigerBid() {
        return this.higherBid;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public String getProductDescription(){
        return this.productDescription;
    }
    
    public double getInitialBid(){
        return this.initialBid;
    }
    
    public ArrayList<Bid> getBidList(){
        return this.bidList;
    }
    
    public ArrayList<String> getPhotoList(){
        return this.productImages;
    }
    public void printBids(){
        for(Iterator<Bid> it = this.getBidList().iterator(); it.hasNext();){
            Bid actual = it.next();
            System.out.println(actual.getObserver().getUserName() + '\t' +": "+ actual.getBidAmount());
        }
    }
    

 
    
}

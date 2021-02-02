package examenordinaria;

import java.util.ArrayList;
import java.util.Iterator;

public class Bidder implements Observer {
    
    private String username;
    private ArrayList<Product> productBidded = new ArrayList<>();
    
    public Bidder(String username){
        this.username = username;
    }
    
    @Override
    public void update(Bid b) {
        System.out.println("---" + this.username + "---");
        System.out.println(" El pujador " + b.getObserver().getUserName() + " ha realizado una puja por valor de " + b.getBidAmount() + "€");
    }
    
    public void makeBid(Product p, double d){
        if(p.getHigerBid().getBidAmount() >= d){
            System.out.println("Debe introducir un valor de puja superior al máximo actual");
        }else if(p.getHigerBid().getObserver().getUserName().equals(this.username)){
            System.out.println("No puede introducir una nueva puja porque es usted quien ha realizado la puja máxima actual");
        
        }else{
            System.out.println( this.getUserName() + ": Ha realizado una puja para " + p.getProductName() + " por valor de " + d + "€");
            p.addBid(this,d);
            productBidded.add(p);
            
        }
    }
    @Override
    public String getUserName(){
        return this.username;
    }
    
    public ArrayList<Product> getProductBidded(){
        return this.productBidded;
    }
    
    public void printProducts(){
        for(Iterator<Product> it = this.getProductBidded().iterator(); it.hasNext();){
            Product actual = it.next();
            System.out.println(actual.getProductName() + ": " + '\t' + actual.getProductDescription() +"." + " Puja más alta actual: " + 
                                    actual.getHigerBid().getBidAmount() + "€ realizada por " + actual.getHigerBid().getObserver().getUserName());
            
            
        }
    }

    
}

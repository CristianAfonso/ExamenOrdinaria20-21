package examenordinaria;

import java.util.ArrayList;
import java.util.Iterator;

public class AuctionList {
    private ArrayList<Product> allList = new ArrayList<Product>();
    
    public void addToList(Product p){
        allList.add(p);
    }
    
    public void printList(){
         for(Iterator<Product> it = this.allList.iterator(); it.hasNext();){
            Product actual = it.next();
            System.out.println(actual.getProductName() + ": " + '\t' + actual.getProductDescription() +"." + " Puja más alta actual: " + 
                                    actual.getHigerBid().getBidAmount() + "€ realizada por " + actual.getHigerBid().getObserver().getUserName());
        }
    }
    
}

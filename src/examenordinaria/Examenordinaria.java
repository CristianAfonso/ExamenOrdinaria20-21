package examenordinaria;

public class Examenordinaria {

    public static void main(String[] args) {
        Observer AuctionHouse = new Bidder("Casa de subastas");
        Product producto1 = new Product("Jarron" , "Jarron del paleolítico", 250, AuctionHouse);
        Bidder bidder1 = new Bidder("Jose Manuel");
        Bidder bidder2 = new Bidder("Donald McCian");
        Bidder bidder3 = new Bidder("Maria Josefa");
        bidder1.makeBid(producto1, 248);
        bidder1.makeBid(producto1, 253);
        bidder2.makeBid(producto1, 255);
        bidder3.makeBid(producto1, 260);
    }
    
}

package examenordinaria;

public class Examenordinaria {

    public static void main(String[] args) {
        Observer AuctionHouse = new Bidder("Casa de subastas");
        Product producto1 = new Product("Jarron" , "Jarron del paleolítico", 250, AuctionHouse);
        Product producto2 = new Product("Fuente en miniatura" , "Pequeña fuente", 120, AuctionHouse);
        Product producto3 = new Product("Boligrafo de Einstein" , "Lo utilizó para calcular la relatividad", 500, AuctionHouse);
        Bidder bidder1 = new Bidder("Jose Manuel");
        Bidder bidder2 = new Bidder("Donald McCian");
        Bidder bidder3 = new Bidder("Maria Josefa");
        bidder1.makeBid(producto1, 248);
        bidder1.makeBid(producto1, 253);
        bidder2.makeBid(producto1, 255);
        bidder3.makeBid(producto1, 260);
        bidder2.makeBid(producto1, 259);
        bidder1.makeBid(producto2, 248);
        bidder1.makeBid(producto3, 620);
        bidder1.printProducts();
    }
    
}

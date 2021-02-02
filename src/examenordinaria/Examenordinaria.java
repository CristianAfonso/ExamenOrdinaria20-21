package examenordinaria;

public class Examenordinaria {

    public static void main(String[] args) {
        AuctionList list = new AuctionList();
        Observer AuctionHouse = new Bidder("Casa de subastas",list);
        Product producto1 = new Product("Jarron" , "Jarron del paleolítico", 250, AuctionHouse);
        Product producto2 = new Product("Fuente en miniatura" , "Pequeña fuente", 120, AuctionHouse);
        Product producto3 = new Product("Boligrafo de Einstein" , "Lo utilizó para calcular la relatividad", 500, AuctionHouse);
        list.addToList(producto1);
        list.addToList(producto2);
        list.addToList(producto3);
        Bidder bidder1 = new Bidder("Jose Manuel",list);
        Bidder bidder2 = new Bidder("Donald McCian",list);
        Bidder bidder3 = new Bidder("Maria Josefa",list);
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

/* This is a stub for the Cafe class */

public class Cafe extends Building{
    public int nCoffeeOunces;
    public int nSugarPackets;
    public int nCreams;
    public int nCups;
    
    
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        coffee = 50;
        sugar = 50;
        cream = 50;
        cups = 50;
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;


        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int pCoffee, int pSugar, int pCream) {

        nCoffeeOunces -= pCoffee;
        nSugarPackets -= pSugar;
        nCreams -= pCream;

    }

        private void restock(int coffee, int sugar, int cream) {
            if (coffee == 0) {
                nCoffeeOunces += 50;}

            if (sugar == 0) {
                nSugarPackets += 50;}

            if  (cream == 0) {
                nCreams += 50 ;}

              } 
             
}
            
        

              public static void main(String[] args) {
                new Cafe();
              }
            
            }
  


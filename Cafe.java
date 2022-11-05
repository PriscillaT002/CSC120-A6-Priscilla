/* This is a stub for the Cafe class */
public class Cafe extends Building{
    
    
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets= sugar;
        this.nCreams= cream;
        this.nCups= cups;

        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams) {

    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {

    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}

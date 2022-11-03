/* This is a stub for the House class */
import java.util.ArrayList;


public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningHall;

  public House(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningHall = true;
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }

}
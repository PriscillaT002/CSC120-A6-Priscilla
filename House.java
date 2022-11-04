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

  public boolean hasDiningHall(){
    if (hasDiningHall == true) {
      System.out.println("There is no dining hall in this house.");
    }
    else{
      System.out.println("There is no dining hall in this house");
    }
    return hasDiningHall;
  }

  public void moveIn(String name) {
    this.residents ;
  }


  public String moveOut(String name){

  }

  public boolean isResident(String person){
    
  }


  public static void main(String[] args) {
    new House();
  }

}
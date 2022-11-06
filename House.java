/* This is a stub for the House class */
import java.util.ArrayList;


public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningHall;
  public int nResidents;

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

  public static void moveIn(String name) {
    ArrayList<String> residents = new ArrayList<String>();
    residents.add(name);
 
  }

  public String moveOut(String name){
    ArrayList<String> residents = new ArrayList<String>();
    residents.remove(name);

    return name;

  }


  public boolean isResident(String person){

      // Creating a Boolean array
      ArrayList<String> residents = new ArrayList<String>();

     

      // Using Booleans.contains() method to search
      // for an element in the array. The method
      // returns true if element is found, else
      // returns false
      if (residents.contains(person))
          System.out.println("Yes, person is a resident");
      else
          System.out.println("No, person is not a resident");

        return false;
  }



 public static void main(String[] args) {
  new House();
}

}
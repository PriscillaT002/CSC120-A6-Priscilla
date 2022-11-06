
/* This is a stub for the Library class */
import java.util.Hashtable

public class Library extends Building{

  Hashtable<String, Boolean> newLibrary;

  public Library(String name, String address, int nFloors, String title, Boolean have) {
    super(name,address,nFloors);

    Hashtable<String, Boolean> newLibrary = new Hashtable<String, Boolean>();
  

    System.out.println("You have built a library: 📖");


  }

  public void addTitle(String title, Boolean have) {

    newLibrary.put(title, have);


  }

  public String removeTitle(String title, Boolean have){

    newLibrary.remove(title, have);

    return title;
  }

  public void checkOut(String title, Boolean have){

   newLibrary.remove(title, have);


    if (have == true) {
      System.out.println(newLibrary.get(have) + "This book is currently checked out"); }



  }

  public void returnBook(String title, Boolean have) {

    newLibrary.put(title, have);

  if (have == true) {
    System.out.println(newLibrary.get(have) + "This book is currently available"); }

  }

  // returns true if the title appears as a key in the Libary's collection, false otherwise
  public boolean containsTitle(String title, Boolean have){
    if (have == true) {
      return true;
    }
    else{
      return false;
    }
  }

  // returns true if the title is currently available, false otherwise
  public boolean isAvailable(String title, Boolean have){
    if (have == true) {
      return true;
      System.out.println("This title is currently available");
    }
    else{
      return false;
    }

  }

  // prints out the entire collection in an easy-to-read way (including checkout status)
  public void printCollection(){

    System.out.println("------------------------------------");
    System.out.println(newLibrary);
    System.out.println("------------------------------------");




  }




  public static void main(String[] args) {
    new Library();
  }

}
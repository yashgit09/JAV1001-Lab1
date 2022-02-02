  /*Name: Yash Kelkar
  Student number: A00242148
  Program description: JAV-1001 - 11329 - App Development for Android 
  Lab - 1 Variable and logic  */

  // importing java scanner to read user input
  import java.util.Scanner;

  public class Convert {
    public static void main(String[] args) {
      //declaring a variable for user input from scanner object to convert into double 
      Double userInputDouble;

          // Creating a Scanner object 
      Scanner scan = new Scanner(System.in);
      // scanner object for unit value
     Scanner scan1 = new Scanner(System.in);
 
      System.out.println("Enter a value you want to convert");

      //taking user input
     String userInput = scan.next(); 
        
   // try and catch to convert - string to Double
    try 
    {
      userInputDouble = Double.valueOf(userInput);

    } catch(Exception e){
      System.out.println("You've entered " + userInput + " which is not a number, please enter a valid positive number.");
      return;
    }

 
          //asking user to input unit to convert to
    System.out.println("Enter the unit of measure from (km, mi, in, cm, kg, lb, ltr, cups)");
    String unit = scan1.next();


    // if user input is greater than zero, the condition will be true and it'll check for next condition
    if(userInputDouble > 0 ){       
      if(unit.equals("km")){         
        double mi;
        mi = userInputDouble*0.62;
        System.out.println(userInputDouble + " km is equal to "+mi+" mi");       
      }

      else if(unit.equals("mi")){         
        double km;
        km = userInputDouble*1.61;
        System.out.println(userInputDouble + " mi is equal to "+km+" km");      
      }

      else if(unit.equals("in")){         
        double cm;
        cm = userInputDouble*0.39;
        System.out.println(userInputDouble + " inch is equal to "+cm+" cm");       
      }

      else if(unit.equals("cm")){         
        double in;
        in = userInputDouble*2.54;
        System.out.println(userInputDouble + " cm is equal to "+in+" in");       
      }

      else if(unit.equals("lb")){          
        double kg;
        kg = userInputDouble*2.2;
        System.out.println(userInputDouble + " lb is equal to "+kg+" kg");       
      }

      else if(unit.equals("kg")){         
        double lb;
        lb = userInputDouble*0.45;
        System.out.println(userInputDouble + " kg is equal to "+lb+" lb");      
      }

      else if(unit.equals("ltr")){          
        double cup;
        cup = userInputDouble*4.17;
        System.out.println(userInputDouble + " ltr is equal to "+cup+" cup");       
      }

      else if(unit.equals("cups")){          
        double L;
        L = userInputDouble*0.24;
        System.out.println(userInputDouble + "cup is equal to "+L+" L");     
      }
      //if user input is not a defined unit, this error will be shown
      else{
        System.out.println("The unit entered is invalid. Please enter value from (km, mi, in, cm, kg, lb, ltr, cups).");
      }

    }

    // if user input is not greater than zero this will be shown.
    else{
      System.out.println("Enter a positive value");
    }

  }
}

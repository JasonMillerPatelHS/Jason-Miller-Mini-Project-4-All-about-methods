import java.util.Scanner; //imports scanner
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in); //declares object scan

    System.out.println("How far is your destination? \n(insert an integer, distance should be in miles)"); //asks user how far away their desination is
    int distance = scan.nextInt(); //scans next line to get int distance

    System.out.println("What would be your average speed? \n(input an integer, mph)"); //asks user for their avg speed
    int speed = scan.nextInt(); //scans for int to be int speed

    System.out.println("What is your car's miles per gallon (Input an integer))"); //asks for cars int mpg 
    int mpg = scan.nextInt();//scans for next in to be MPG

    System.out.println("How much gas do you have? (Input an integer, unit of measurement is gallons)");
    int gallonOfGas = scan.nextInt();

    System.out.println("Your car ride will take: " + travelTime(distance,speed) + " hours."); //prints return from method travelTime
    boolean hasEnoughGas = enoughGas(distance, mpg, gallonOfGas);
    System.out.println(response(hasEnoughGas));//prints return of method enoughGas
  }
  //methods

  static double travelTime(int distance, int speed)
  {
    return distance/speed; //returns distance divided by speed to get time of the trip
  }
  
  static boolean enoughGas(int distance, int mpg, int gasInTank)
  {
    boolean enoughInTank;
    if(distance/mpg <= gasInTank) //calculates the gas that would be used
    {
      enoughInTank = true;
      return enoughInTank;
    }
    else //if there is not enough gas
    {
      enoughInTank = false;
      return enoughInTank; //returns the boolean (True/False)
    }
  }
  static String response(boolean hasGas)
  {
    if(hasGas) //If boolean hasGas is true do this:
    {
      String response = "You have enough gas, enjoy your ride!";
    return response;
    }
    else // if boolean hasGas is not true do this:
    {
      String response = "You don't have enough gas, you might need to fill up for more on the way.";
      return response;
    }
  }
}
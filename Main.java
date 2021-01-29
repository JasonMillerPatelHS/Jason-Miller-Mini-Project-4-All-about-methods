import java.util.Scanner; //imports scanner
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in); //declares object scan

    System.out.println("How far is your destination? \n(insert a integer, distance should be in miles)"); //asks user how far away their desination is
    int distance = scan.nextInt(); //scans next line to get int distance

    System.out.println("What would be your average speed? \n(input an integer, mph)"); //asks user for their avg speed
    int speed = scan.nextInt(); //scans for int to be int speed

    System.out.println("What is your car's miles per gallon (Input an integer))"); //asks for cars int mpg 
    int mpg = scan.nextInt();//scans for next in to be MPG

    System.out.println("How much gas do you have? (Input an integer, unit of measurement is gallons)");
    int gallonOfGas = scan.nextInt();

    System.out.println("Your car ride will take: " + travelTime(distance,speed) + " hours."); //prints return from method travelTime
    System.out.println("Do you have enough gas for the trip: " + enoughGas(distance, mpg, gallonOfGas));//prints return of method enoughGas
  }
  //methods

  static int travelTime(int distance, int speed)
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
    else
    {
      enoughInTank = false;
      return enoughInTank;
    }
  }
  static String response(boolean hasGas)
  {
    if(hasgas)
    {
      String response = "You have enough gas, enjoy your ride!"
    return response;
    }
    else
    {
      String response = "You don't have enough gas, you might need to fill up for more on the way.";
    }
  }
}
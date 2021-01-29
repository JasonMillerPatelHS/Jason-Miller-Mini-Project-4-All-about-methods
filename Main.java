import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("How far is your destination? \n(insert a integer, distance should be in miles)"); //asks user how far away their desination is
    int distance = scan.nextInt(); //scans next line to get int distance

    System.out.println("What would be your average speed? \n(input an integer, mph)");
    int speed = scan.nextInt();

    System.out.println("What is your car's miles per gallon (Input an integer))");
    int mpg = scan.nextInt();

    System.out.println("How much gas do you have? (Input an integer, unit of measurement is gallons)");
    int gallonOfGas = scan.nextInt();

    System.out.println("Your car ride will take: " + travelTime(distance,speed) + " hours.");
    System.out.println("Do you have enough gas for the trip: " + enoughGas(distance, mpg, gallonOfGas));
  }
  static int travelTime(int distance, int speed)
  {
    return distance/speed;
  }
  static boolean enoughGas(int distance, int mpg, int gasInTank)
  {
    boolean enoughInTank;
    if(distance/mpg <= gasInTank)
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
}
public class Main {
   public static double feetToInches(double feet) {
    double inches;
    // TODO: Convert feet to inches (1 foot = 12 inches)
    inches = 12 * feet;
    return inches;
}
  public static double calcLadderSize(double height, double width) {
   double ladderSize;
   // TODO: Calculate using Pythagorean theorem
   // Use Math.sqrt and Math.pow or *
   // A is height b is width c is ladderSize
   ladderSize = Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
   return ladderSize;
  }

  public static int randomPlankDelivery() {
    int planks;
    // TODO: Use Math.random to generate an int from 10 to 50
    planks = (int) (Math.random()*41) + 10;
    return planks;
}




   public static void main(String []args) {
     double result = feetToInches (8);
     System.out.println("8.0 feet = " + result + " inches");
     

     double size = calcLadderSize(30,40);
     System.out.println("We ned a " + size + " foot ladder");

     int delivery1 = randomPlankDelivery();
     int delivery2 = randomPlankDelivery();
     int delivery3 = randomPlankDelivery();
     System.out.println("First truck delivered " + delivery1 + " planks");
      System.out.println("Second truck delivered " + delivery2 + " planks");
      System.out.println("Third truck delivered " + delivery3 + " planks");
   


   }
}

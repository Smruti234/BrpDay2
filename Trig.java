import java.util.Scanner;

class Trig {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the degree value:");
         double degrees = sc.nextDouble();
         double radians = Math.toRadians(degrees);
         double sinValue = Math.sin(radians);
         System.out.println("sin(" + degrees + ") = " + sinValue);
         double cosValue = Math.cos(radians);
         System.out.println("cos(" + degrees + ") = " + cosValue);
         double tanValue = Math.tan(radians);
         System.out.println("tan(" + degrees + ") = " + tanValue);
     }
}

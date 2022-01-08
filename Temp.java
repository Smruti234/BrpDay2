import java.util.Scanner;

class TemperatureConversion{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius  = ( 5.0 * (fahrenheit - 32.0) ) / 9.0;
        System.out.println(fahrenheit + " F is same as " + celsius + " C.");

    }
}
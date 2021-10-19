import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
    DecimalFormat roundTo2 = new DecimalFormat ("0.##");

    System.out.println("What's your first number?");

    double num1 = read.nextDouble();

    System.out.println("What's your second number?");

    double num2 = read.nextDouble();

    System.out.println(num1 + " + " + num2 + " = " + roundTo2.format(num1+num2));
    System.out.println(num1 + " - " + num2 + " = " + roundTo2.format(num1-num2));
    System.out.println(num1 + " * " + num2 + " = " + roundTo2.format(num1*num2));
    System.out.println(num1 + " / " + num2 + " = " + roundTo2.format(num1/num2));
  }
}
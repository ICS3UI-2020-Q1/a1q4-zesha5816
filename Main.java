import java.util.Scanner;
/**
 *a program to help grade 9s calculate the slope of a line given two points
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user to input the x1 co ordinate
  System.out.println("Please enter in the x coordinate of the first point");
	//get input from user for x1 
	int x1 = input.nextInt();
	// rpomt user for y1
	System.out.println("Please enter in the y coordinate of the first point");
	int y1 = input.nextInt();
  System.out.println("Please enter in the x coordinate of the second point");
	int x2 = input.nextInt();
	System.out.println("Please enter in the y coordinate of the second point");
	int y2 = input.nextInt();
	//calc the top half of the slope form
	double top_half = y2 - y1;
	//calc the bottom half of the slope form
	double bottom_half = x2 - x1;
	// divide the top half and the bottom half 
	double slope = top_half/bottom_half;
	// print the slope 
	System.out.println("The slope of your line would be " + slope + ".");
  }
}

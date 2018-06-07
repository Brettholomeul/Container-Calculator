// Title:            Container Calculator
// Files:            ContainerCalculator.java
// Semester:         Spring 2017
//
// Author:           Brett Fisher
// Email:            bfisher4@wisc.edu


import java.util.Scanner;

public class ContainerCalculator {
	
	
	
	public static void main(String[] args) {
		ContainerCalculator cc = new ContainerCalculator();
		
		//Setting up the scanner
		Scanner in = new Scanner(System.in);
		
		
		int selection = 0;
		
		//The heading output
		System.out.println("Welcome to the Container Calculator!");
		System.out.println("====================================");

		System.out.println("Please select a shape to calculate: \n"
				+ "Cylinder: [1]\nCube: [2]\nSphere: [3]");
		
		while (!in.hasNextInt()){
			System.out.println("Please select from the given options: ");
		}
		
		selection = in.nextInt();
		
		if (selection == 1){
			cc.cylinder();
		}
		else if (selection == 2){
			cc.cube();
		}
		else if (selection == 3){
			cc.sphere();
		}
		
		in.close();
	}

	public void cylinder(){
		int diameter = 0;
		int height = 0;
		
		double volumeOriginal = 0;
		double surfaceOriginal = 0;
		
		System.out.print("You have chosen Cylinder.\nPlease enter the diameter"
				+ " for the cylinder (in inches): ");
		
		Scanner scan = new Scanner(System.in);
		
		//Read in an integer for diameter or ask for an integer
		while(!scan.hasNextInt()){
			System.out.print("\nPlease enter an integer: ");
		}
		diameter = scan.nextInt();
		
		System.out.print("\nPlease enter the height for the cylinder (in inches): ");
		
		while(!scan.hasNextInt()){
			System.out.print("\nPlease enter an integer: ");
		}
		height = scan.nextInt();
		
		//The first calculations of volume and surface area for a cylinder
		volumeOriginal = Math.PI * Math.pow((diameter / 2.0), 2.0)
				* height;
		surfaceOriginal = (2.0 * Math.PI * height * (diameter / 2.0))
				+ (2.0 * Math.PI * Math.pow((diameter / 2.0), 2.0));


		//Giving the results of the calculations
		System.out.println("\nA cylinder with a diameter of " + diameter 
				+ " inches and a height of " + height + " inches has ");
		
		
		//Printing the volume statement
		System.out.print("\t" + "a volume of ");
		System.out.printf("%.2f", volumeOriginal);		
		System.out.println(" cubic inches,");

		
		//Printing the surface area statement
		System.out.print("\t" + "and a surface area of ");
		System.out.printf("%.2f", surfaceOriginal);			
		System.out.println(" square inches.");
		
		scan.close();
	}
	
	public void cube(){
		int sideLength = 0;
		double volume = 0;
		double surfaceArea = 0;
		
		System.out.print("You have chosen Cube.\nPlease enter the length of a side"
				+ " for the cylinder (in inches): ");
		
		Scanner scan = new Scanner(System.in);
		
		while(!scan.hasNextInt()){
			System.out.print("\nPlease enter an integer: ");
		}
		sideLength = scan.nextInt();
		
		volume = Math.pow(sideLength, 3);
		
		surfaceArea = 6 * Math.pow(sideLength, 2);
		
		System.out.println("\nA cube with a side length of " + sideLength + " has ");
		System.out.print("\t" + "a volume of ");
		System.out.printf("%.0f", volume);
		System.out.println(" cubic inches,");
		
		System.out.print("\t" + "and a surface area of ");
		System.out.printf("%.0f", surfaceArea);			
		System.out.println(" square inches.");
		
		scan.close();
	}
	
	public void sphere(){
		int diameter = 0;
		double volume = 0;
		double surfaceArea = 0;
		
		System.out.print("You have chosen Sphere.\nPlease enter the diameter of the"
				+ " sphere (in inches): ");
		
		Scanner scan = new Scanner(System.in);
		
		while(!scan.hasNextInt()){
			System.out.print("\nPlease enter an integer: ");
		}
		diameter = scan.nextInt();
		
		volume = (4/3) * Math.PI * Math.pow(diameter/2, 3);
		
		surfaceArea = 4 * Math.PI * Math.pow(diameter/2, 2);
		
		System.out.println("\nA sphere with a diameter of " + diameter + " has ");
		System.out.print("\t" + "a volume of ");
		System.out.printf("%.2f", volume);
		System.out.println(" cubic inches,");
		
		System.out.print("\t" + "and a surface area of ");
		System.out.printf("%.2f", surfaceArea);			
		System.out.println(" square inches.");
		
		scan.close();
	}
}
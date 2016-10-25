/*
 *Daniel Cancelmo
 *Project 2
 *CSC 172 - Professor Pawlicki
 *Lab: Mon. & Wed. 12:30-1:45
 *I did not collaborate with anyone on this assignment.
 */

import java.util.Scanner;

public class CalculatorTest extends ShuntYard {
	
	public static void main(String[] args) {
		//Scans in the file names
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the input file name and the output file name seperated by a space:");
		String inName = scan.next();
		String outName = scan.next();
		scan.close();
		//Calculates the expressions in inName and writes answers to outName
		shunt(inName, outName);
		System.out.println("Program complete.");
	}
	
}

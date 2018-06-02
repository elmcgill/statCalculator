package statCalculator;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.*;

public class StatGenerator {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		StatReader read = new StatReader();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select calculating mode: 1 Standard 2 Advanced");
		int mode = scan.nextInt();
		
//		System.out.println("Copy the file path you would like to read.");
//		
//		String filepath = scan.next();
		
		//System.out.println("What would you like to name the file?");
		
		//String fileName = scan.next();
		
//		System.out.println("Where would you like to output?");
//		
//		String folder = scan.next();
		
		System.out.println("Choose a name for your division of teams");
		
		String divisionName = scan.next();
		
		Division division = new Division(divisionName);
		
		String filepath = "C:\\Users\\Ethan\\eclipse-workspace\\Call of Duty Stat Calculator\\src\\Basic Stats.txt";
		String savePath = "C:\\Users\\Ethan\\Desktop\\Stats\\Test1.csv";
		
		if(mode == 1) {
			generateGeneral(filepath,savePath,read,division);
		}
		
		
	}
	
	public static void generateGeneral(String statSheet, String output, StatReader read, Division division) throws FileNotFoundException {
		OutputStream outputStream = new PrintStream(output);
		read = new StatReader(statSheet, division);
		FileFormatter format = new FileFormatter(division);
		format.generateGeneral(outputStream);
	}
}

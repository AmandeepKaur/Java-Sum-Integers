import java.util.Scanner;
import java.io.*;

class SumIntegers {
	public static void main(String[] args) throws IOException {
		int sum = 0;

		// this Scanner is used to read what the user enters
		Scanner user = new Scanner(System.in);
		String fileName;

		System.out.print("Enter Input File Name: ");
		fileName = user.nextLine().trim();
		File Inputfile = new File(fileName); // create a File object

		// this Scanner is used to read from the file
		Scanner scan = new Scanner(Inputfile);
		
		 // prepare the output file
	    System.out.print("Output File Name: ");
	    fileName = user.nextLine().trim();
	    File Outputfile = new File( fileName );      
	    PrintStream  print = new PrintStream( Outputfile);  

		while (scan.hasNextInt()) {

			int nextInt = scan.nextInt();
			sum += nextInt;
			System.out.println("The Next number for the sum is = " + nextInt);
			System.out.println("RESULT =" + sum);
			print.println("The Next number for the sum is = " + nextInt);
			print.println("RESULT =" + sum);
		}
		scan.close();
		user.close();
		print.close();
	}
}
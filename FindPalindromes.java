
// FindPalinedromes.java -- this class will read an input file, see if the lines of that file are palindromes, then create an output file called "foundpalindromes.txt" that will print out all the discovered palindromes. 


import java.io.File;
import java.util.*;
import java.io.PrintWriter;

public class FindPalindromes {
	// main method 
	 public static void main(String args[]) {
	        final String FOUND_PALINDROMES = "foundpalindromes.txt";
	        final String CHAR_SET = "UTF-8";

	        try {
	            // creates File and Scanner objects from text file
	            File textFile = new File(args[0]);
	            Scanner textScanner = new Scanner(textFile);

	            // builds ArrayList with the potential palindromes uses buildpalindromesList method 
	            ArrayList<String> palindromeList  = buildpalindromesList(textScanner);
	            textScanner.close();

	            // writing output to palindromes.txt
	            File foundPalindromes = new File(FOUND_PALINDROMES);
	            PrintWriter textOut = new PrintWriter(foundPalindromes, CHAR_SET);
	            write2outputFile(palindromeList, textOut);
	            textOut.close();
	        }
	        catch(Exception FileNotFoundException) 
		{
	            System.out.println("I/O error.");
	        }
	    }

	 // writes to output file 
	private static void write2outputFile(ArrayList<String> palindromeList, PrintWriter textOut) 
	{
	        
	        // go from the start
	        for(int i = 0; i < palindromeList.size()-1; i++) 
	        {
	                textOut.print("The following phrase: '" + palindromeList.get(i) + "' is a palindrome." + "\n");
	        }																
	       
	}
	
	// method to build an ArrayList from textfile
	private static ArrayList<String> buildpalindromesList(Scanner textScanner) 
	{
		// construct array list of the potential Palindromes from the text
	        ArrayList<String> list = new ArrayList<String>();

	        // go through each line of the file
	        while(textScanner.hasNextLine()) 
	        {						 
	            String textLine = textScanner.nextLine(); //// prepare each line to be processed
	            String lettersOnly = textLine.replaceAll("[\\W]", ""); // gets rid of whitespace/punctation
          		            
	            if (palindromecheck(lettersOnly)) // if this returns true
	            {
	            	list.add(textLine); // adds string to list
	            }
	           
	        } // end while loop 
	       
	        return list;          
	}

	// method to check if a line is palindrome 
	private static boolean palindromecheck(String input)
	{
		MyStack <Character> stack1 = new MyStack<Character>(); // creates a stack of character  
		
		boolean b1 = false; // creates a boolean value and sets it to false
				
		for (int i= 0; i < input.length(); i++ )
		{			
			stack1.push(input.charAt(i));
		}
		
		String reverseinput = ""; // initializes string n 
				
		while(!stack1.isEmpty())
		{

			reverseinput += (stack1.pop()); //build string n with the values being popped from the stack // 
		}
		
		b1 = reverseinput.equalsIgnoreCase(input); // checks if the string of popped values is equal to the input string but ignores case-sensitivity and reevaluates the boolean
 		return b1;
	}

	


}

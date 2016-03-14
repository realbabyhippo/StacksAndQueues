// Juliette Kang
// Program2.java - tester class with a main method to demonstrate that your TwoStackQueue works correctly and will alphabetize names from an ArrayList 

import java.util.ArrayList;

public class Program2 
{
	public static void main(String args[]) 
	{
		// Creates an ArrayList that will contain strings
		ArrayList <String> Friends = new ArrayList<String>(9);
		{	
			// fills in ArrayList with strings//
			Friends.add("Blaire "); // 0
			Friends.add("Pia"); // 1
			Friends.add("David"); // 2
			Friends.add("Sebastian"); // 3
			Friends.add("Mabel"); // 4
			Friends.add("Craig");  // 5
			Friends.add("Yolanda");  // 6
			Friends.add("Teddy");  // 7
			Friends.add("Allie");  // 8
		}
	
		// Creates the queue object first constructed in TwoStackQueue.java 
		TwoStackQueue<String> Myqueue =  new TwoStackQueue<String> ();
		{						  
			Myqueue.enqueue(Friends.get(8)); //adds Allie to stack1
			String a = Myqueue.dequeue(); // dequeues "Allie" -- transfers this string form satck 1 -->stack 2, pops it for it's at the top of stack 2 and return this name as String a
			Myqueue.enqueue(Friends.get(0)); //adds Blaire to stack1
			String b = Myqueue.dequeue(); // dequeues String "Blaire" -- tranferring it from stack 1 --> 2, pops and returns the value and sets it equal to String b. 
			Myqueue.enqueue(Friends.get(5)); //adds Cra to stack1												 
			Myqueue.enqueue(Friends.get(2)); //adds Dav to stack1
			Myqueue.enqueue(Friends.get(4)); // adds Mab to stack1
			Myqueue.enqueue(Friends.get(1)); // adds Pia to stack1
			Myqueue.enqueue(Friends.get(3)); // adds Seb to stack1
			Myqueue.enqueue(Friends.get(7)); // adds Ted to stack1
			Myqueue.enqueue(Friends.get(6)); // adds Yol to stack1
			String output = "\n" + a + "\n"+ b; // creates a string of the first and secondly popped name 
		
			// start a for loop at the 3rd element 
			for (int i = 2; i < 9; i++) 
			{
				String x = Myqueue.dequeue(); // dequeue the name by popping it from the top of stack 2
				output = output + "\n" + x; // concatenate this name to the string of alphebetized names  
			}	
			
			System.out.println("_________________________________________________");
			System.out.println(output); // prints alphabetized list of names
			System.out.println("_________________________________________________");
		}										
		
	}
}


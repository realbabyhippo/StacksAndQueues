// Juliette Kang
// JK3466
// README.txt

In this submission there are 4 classes files and 3 text files. 
The 4 class files are: 
	1) MyStack.java
	2) FindPalindromes.java
	3) Program2.java 
	4) TwoStackQueue.java

The 2 text files are:
	1) README.txt
	2) Palindromes.txt (a list fo palindromes to test)


You can compile all these files by typing in:	<javac CLASSNAME.java> 
and you can run these files by typing in: < java CLASSNAME > 

Note that to correctly run FindPalindromes.java you must type in <java FindPalindromes palindromes.txt> Furthermore, the palindromes.txt file must be in the same directory as the FindPalindromes.java class file. 


MYSTACK.JAVA 
This generic class file constructs a stack made from a LinkedList. 
It includes:
	1) a push method to add items to a stack
	2) a pop method to remove items from a stack and return their values
	3) an isEmpty method to check whether a stack is empty or not. 

Because this is a generic class, MyStack can be implemented on any type of object. It is used in the FindPalindromes class with Characters and it is used in the Program2 class with Strings. 

FINDPALINDROMES.JAVA 
This class inputs a text file (palindromes.txt) and uses a Scanner object to read each line of text from the file to create an ArrayList of Strings. This ArrayList known as “palindromeList” includes all the lines from the input file that are palindromes. This class then creates an output file (foundpalindromes.txt) that lists all the elements in this ArrayList. 

This class uses various methods such as:

	1) buildpalindromesList which creates the list of found palindromes by checking the input file for a next line, isolating solely the letters of that line (ignoring white space and punctuation) then feeding this line of text to the palindromeCheck method.

	2) the palindromeCheck method returns a boolean if a line is found to be a palindrome. It fills a stack by pushing in characters of a line from the input textile, then it created a string of the elements returned when this stack is filled. This string concatenates the line in reverse. Therefore, if this new string is equivalent to the original string, the line is found to be a palindrome.

TWOSTACKQUEUE.JAVA 
This class file:
	1)constructs an empty queue made of two stacks

	2)creates a enqueue method which fills the first stack (thereby, also filling the entire queue) with an item

	3)creates a dequeue method which transfers the items from the first stack to the second stack through push/pop methods, then pops and returns the item at the top of the second stack. 

PROGRAM2.JAVA
This class tests the methods that were written in the TwoStackQueue class. It first creates an ArrayList of Strings of people’s names. Then it creates a TwoStackQueue object as originally constructed in the TwoStackQueue class and implements the enqueue and the dequeue methods from the TwoStackQueue class to fill the queue with these names. These elements are queued in such a way that will ultimately place them in alphabetical order. It creates strings from the returned values after items are popped from stack2. This class also employs a for-loop to go through the queue, dequeue the elements and concatenate the return values (names) to the String output, which is what is ultimately printed to the user.


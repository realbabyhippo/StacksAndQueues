//JULIETTE KANG
//JK3466
// TwoStackQueue - generic class that implements a queue using two stacks


public class TwoStackQueue <E>
{
	
	private MyStack<E> stack1 = new MyStack<E>(); // creates stack 1 from stack implementation, this is where elements enter queue  
	private MyStack<E> stack2 = new MyStack<E>(); // creates stack 2 from stack implementation, this is where elements leave the queue

	// construct an empty queue
    public TwoStackQueue() 
    {
        stack1 = new MyStack<E>();
        stack2 = new MyStack<E>();
    }
    
	// adds an element to the queue
	public void enqueue(E e )
	{
			stack1.push(e); // fills the queue (specifically stack1) with element e 
	}
	
	// removes an element to the queue
	public E dequeue() 
	{
			if (stack2.isEmpty()) // checks if stack2 is empty, so it can be filled with elements from stack1
			{
					while (!stack1.isEmpty()) // while-loop to be conducted if stack1 is not empty. This will transfer elements from stack1 into stack2 until stack1 is emptied.
					{
						stack2.push(stack1.pop()); // fill/push stack2, with the item that is being removed/popped from stack1
					}
			}
			
			return stack2.pop(); // remove/pop the item at the top of stack2, and return it.
	}
}	


import java.util.Stack;
import java.lang.String;

class stack
{
    public static void main(String[] args)
    {
        // constructor
        Stack s = new Stack();    // creates an empty stack
        System.out.println("New Stack " + s);

        // empty() - returns boolean
        System.out.println("Check Empty " + s.empty());

        // push(element) - returns the element entered
        // pushes the element on the top of stack
        s.push(1);    
        s.push(5);
        s.push(9);
        s.push(4);
        s.push(7);
        System.out.println("Push " + s.push(2));

        // peek() - returns object on top of stack
        // does not remove the element
        // throws EmptyStackException if stack is empty
        System.out.println("Peek element " + s.peek());

        // pop() - returns object on top of stack
        // removes the element from the stack
        // throws EmptyStackException is stack is empty
        System.out.println("Popped Element " + s.pop());

        // search(element) - returns int counting from 1 and top of stack
        System.out.println("Search Element Position " + s.search(2));    // if not found returns -1
    }	
}

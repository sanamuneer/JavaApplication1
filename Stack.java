import java.util.Scanner;
public class MyStack
{

private int size;
private int top;
private long stackArray;

public MyStack()
{

size = 5;
stackArray = new long[size];
top = -1;

}

public void push (long j)
{
stackArray[++top] = j;
}

public long pop()
{
return stackArray[top];
}

public Boolean isEmpty()
{
 return (top==-1);
}

public Boolean isFull()
{
return (top=size-1);
}
}

public class Mainclass
{

 public static void main (String[]args)
 {
 
 MyStack Stack = new Stack(10);
 Stack.push(10);
 Stack.push(20);
 Stack.push(30);
 Stack.push(40);
 Stack.push(50);
 
 while (!theStack.isEmpty()) 
  {
      int value = Stack.pop();
   System.out.print(value);
   }
 }
 }

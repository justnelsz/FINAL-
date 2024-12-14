class Node
{
   Object value;
   Node next;
   
   public Node(Object value)
   {
      this.value = value;
      next = null;
   }
}
public class QueueNode 
{
   Node first;
   Node last;
   int count;
   
   public QueueNode()
   {
      first = null;
      last = null;
      count = 0;
   }
   
   public boolean isEmpty()
   {
      return first == null && last == null;
      //return count == 0;
   }
   
   public boolean enqueue(Object value)
   {
      Node newNode = new Node(value);
      if(isEmpty())
      {
         //first = last = newNode;
         first = newNode;
         last = newNode;
      }
      else 
      {
         last.next = newNode;
         last = newNode;
      }
      count++;
      return true;
   }
   
   public boolean dequeue()
   {
      if(!isEmpty())
      {
         if(first == last)
         {
            first = null;
            last = null;
         }
         else 
         {
            first = first.next;
         }
         count--;
         return true;
      }
      else 
         return false;
   }
   
   public Object getFirst()
   {
      if(!isEmpty())
         return first.value;      
      else
         return null;
   }
   
   public Object getLast()
   {
      if(!isEmpty())
         return last.value;
      else
         return null;
   }
   
   
   //toString
   public String toString()
   {
      String result = "";
      if(!isEmpty())
      {
         result += "first = [" + first.value + "]\n";
         result += "last  = [" + last.value + "]\n";
      
         Node temporary = first;
         while(temporary != null)
         {
            result += "[" + temporary.value + "]->";
            temporary = temporary.next;
         }
         result += "\n";
      }
      
      return result;
   }
   
   public void display()
   {
      if(!isEmpty())
      {
         Node temporary = first;
         while(temporary != null)
         {
            System.out.print("[" + temporary.value + "]->");
            temporary = temporary.next;
         }
         System.out.println();
      }  
      else
         System.out.println("Queue is empty...");
   }
}
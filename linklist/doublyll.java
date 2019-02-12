/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.Scanner;

class Node1
{
     int data;
    Node1 next,prev;
    
    Node1(int data)
    {
        this.data=data;//constructor recieve node class
        this.prev=null;
        this.next=null;
    }

    
}
class ll// repersent full linklist
{
    Node1 head,tail;
    int size;
    
   

 public void display(){
            if(head == null)
            {
                System.out.println("list is empty");
            }
            else
            {
                Node1 temp = head;
                System.out.println("display:- "+ " ");
                while(temp != null)
                {
                    System.out.println(temp.data);
                    temp=temp.next;
                }
                //traverseReverse(head);
    
                
            }
        }
public void displayReverse()
{
if(tail==null)
{
    System.out.println("list is empty");
}
else
{
    Node1 temp=tail;
    System.out.println("reverse:- "+ " ");
                while(temp != null)
                {
                      System.out.println(temp.data);
                    temp=temp.prev;
                }
    
}

}

public void insertBeg(int data)
    {
        Node1 node= new Node1(data);
       
        if(head == null)
        {
            head=node;
            tail=node;
        }
        else
        {
              head.prev=node;

            node.next=head;
           
            
            head=node;
        }
      
    }
 public void insertEnd(int data)
    {
        
        Node1 node=new Node1(data);
        
        if(head == null)
        {
            head = node;
            tail=node;
            
        }
        else
        {
            tail.next=node;
            node.prev=tail;
            tail=node;
            
        }
     
    }
 
  public void deleteBeg()
{
if(head== null)
{
    System.out.println("empty list");
}
else
{
    head= head.next;
    head.prev=null;
    
}

    }
 public void deleteEnd()
 {
    
     if(tail== null)
     {
         System.out.println("ERROR");
     }
     else
     {
         tail=tail.prev;
         tail.next=null;
     }
 }
 
 


}
 public class doublyll {
 public static void main(String[] args)
 { 
     int n;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number of elements");
     n=sc.nextInt();
    
     
      ll list = new ll();
      System.out.println("enter the elements ");
      for(int i =0 ;i<n;i++)
      {
         int  p=sc.nextInt();
          list.insertEnd(p);
          
      }
      list.insertEnd(7);
      list.deleteBeg();
      list.deleteEnd();
      list.display();
      list.displayReverse();
      
      
       
}
 
}

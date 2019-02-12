/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.Scanner;

class Node//repersents individual node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data=data;//constructor recieve node class
    }
 
}
class Linklist// repersent full linklist
{
    Node head;
    int size;
    
    public void insertEnd(int data)
    {
        
        Node node=new Node(data);
        size++;
        if(head == null)
        {
            head = node;
            
        }
        else
        {
            Node current;
            current = head;
            
            while(current.next !=null)
            {
                current=current.next;
            }
            current.next= node;
        }
    }
    public void insertBeg(int data)
    {
        Node node= new Node(data);
        size++;
        if(head == null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head=node;
        }
    }
        public void traverse(){
            if(head == null)
            {
                System.out.println("list is empty");
            }
            else
            {
                Node current = head;
                System.out.println("List elements are:- "+ " ");
                while(current != null)
                {
                    System.out.println(current.data);
                    current=current.next;
                }
               // traverseReverse(head);
    
                
            }
        }
        public void traverseReverse(Node node){
           if(node == null)
           {
               return;
               
           }
           traverseReverse(node.next);
           System.out.println(node.data);
           
        }
        public void  alter()
        {
            if(head==null)
            {
                System.out.println("list is empty");
                
            }
            else
            {
                Node temp=head;
                while(temp != null )
                {
                    System.out.println(temp.data);
                temp=temp.next;
                 if(temp != null)
                 {
                     temp=temp.next;
                 }
               
           
                }
                
                    
                }
            }
  public void insertPos(int pos,int data)
{
Node temp=head;
Node node = new Node(data);
Node prev ;


if(temp ==null)
{
    System.out.println("list is empty");
}
else{
    for(int i =1;i<pos-1;i++)
    {
        temp=temp.next;
    }
    prev=temp.next;
    temp.next=node;
    node.next=prev;
}

traverse();
}

  public int returnsize()
  {
      return size;
  }


//        public void printMiddle()
//        {
//            Node temp= head;
//           int mid= size/2;
//           for( int i=0;i<mid-1;i++)
//           {
//               temp=temp.next;
//           }
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        
        //}
       
  public void deleteBeg()
{
Node temp=head;
if(head== null)
{
    System.out.println("empty list");
}
else
{
    head= temp.next;
    temp.next=null;
}
 traverse();
    }
public void deleteend()
{
    if(head==null)
    {
        
        
    }
    else
    {
        Node prev=head;
        Node current=head;
        while(current.next != null)
        {
            prev=current;
            current=current.next;
        }
        prev.next=null;
    }
    traverse();
}

}
    


public class llist1 {
    public static void main(String[] args)
    {
        int pos,data;
        Scanner sc= new Scanner(System.in);
        
        Linklist list = new Linklist();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
        System.out.println("enter the position");
        pos=sc.nextInt();
        System.out.println("enter the data");
        data=sc.nextInt();
        
//      if(pos <list.returnsize())
//        {
//            list.insertPos(pos,data);
//        }
//        else
//        {
//            System.out.println("error");
//        }
        
           list.deleteBeg();
           list.deleteend();
    
    }
   
    
    
}

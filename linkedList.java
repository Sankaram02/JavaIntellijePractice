public class linkedList
{
    // creation of Linked List
    public static class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
        }
    }

    // dislay The linked list using while loop
    public static void display(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    // Display linked list using Recursion
    public static void displayRecursively(Node head)
    {
        if (head==null) return;
        System.out.println(head.data);
        displayRecursively(head.next);
    }


    public static void main(String[] args)
    {
        Node a = new Node(10);
        Node b = new Node(0);
        Node c= new Node(12);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
    }
}

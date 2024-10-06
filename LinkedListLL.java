public class LinkedListLL
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static class linkedList
    {
        Node head=null;
        Node tail=null;

        // insert at end
        void insertAtEnd(int data)
        {
            Node temp = new Node(data);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
            }
            tail=temp;
        }

        // insert at begin
        void insertAtBegin(int data)
        {
            Node temp = new Node(data);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }

        }

        // inser at given position
        void insertAtGivenPosition(int pos,int data)
        {
            Node temp= new Node(data);
            Node traversal=head;
            int count=2;
            while (true)
            {
                traversal=traversal.next;
                count++;
                if(count==pos)
                {
                    temp.next=traversal.next;
                    traversal.next=temp;
                    break;
                }
            }
        }

        // get element at given position
        int get(int pos)
        {
            Node temp=head;
            for (int i = 0; i < pos-1; i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        //Delete at given point
        void deleteAtPos(int pos)
        {
            Node temp=head;
            Node tempPrev=head;
            for (int i = 1; i <pos ; i++)
            {
                tempPrev=temp;
                temp=temp.next;
            }
            tempPrev.next=temp.next;
        }

        // display linked list
        void display()
        {
            Node temp=head;
            temp=head;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        // size of linked list
        int size()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }

    }


    public static void main(String[] args)
    {
        linkedList ll= new linkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.deleteAtPos(3);
        ll.display();
        
    }
}

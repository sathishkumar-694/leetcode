import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data, Node next)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class Main {
    public static Node deleteNode(Node head, int element)
    {
        Node temp = head;
        Node prev =null;
        if(head==null)
            return head;
        if(temp.data==element)
            return head.next;
        while(temp!=null)
        {
            if(temp.data == element)
            {
            prev.next = temp.next;
            break;
            }
            prev = temp;
            temp= temp.next ;
        }
        return head;

    }
    static void displayList(Node head)
    {
        Node dummy = head;
        while(dummy!=null)
        {
            System.out.print(dummy.data+" ");
            dummy = dummy.next;
        }
    }

    public static void main(String[] args) {
        //normal input method java only not dsa

        //Scanner inp = new Scanner(System.in);
        // List<Integer> res = new LinkedList();
        // int len = 5;//inp.nextInt();
        // for(int i = 0 ; i<len;i++)
        // {
        //     int temp = inp.nextInt();
        //     res.add(temp);
        // }
        //System.out.println(res);
        Scanner inp = new Scanner(System.in);
        Node head = null , tail = null;
        int len = inp.nextInt();
        for(int i = 0 ; i<len ; i++)
        {
            int x = inp.nextInt();
            Node temp = new Node(x);
            if(head==null)
                head = tail = temp;
            else
            {
                tail.next = temp;
                tail = temp;
            }

        }
        deleteNode(head , 7);
        displayList(head);
    }
}
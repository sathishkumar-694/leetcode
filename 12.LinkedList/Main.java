import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
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
            System.out.println("Element "+element+" deleted successfully");
            prev.next = temp.next; //prev.next.next is also ok
            break;
            }
            prev = temp;
            temp= temp.next ;
        }
        return head;
    }

    static Node insertNode(Node head, int val, int pos)
    {
        if(head==null)
            return new Node(val);
        if(pos==0)
        {
            Node nn= new Node(val);
            nn.next = head;
            System.out.println("Element inserted at beginning");
            return nn;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        Node newNode = new Node(val);
        while(temp!=null && count<pos)//edge case //pos-1 if 1 or indexing=0
        {
            prev = temp;
            temp = temp.next;
            count++;
        }
        //also without prev this can be acheived
        //remove prev and then
        //newNode.next = temp.next;
        //temp.next = new Node
        prev.next = newNode;
        newNode.next = temp;
        

        System.out.println("Element "+val+" inserted at position "+pos);
        return head;   
    }

    static Node insertNodeByElement(Node head , int beforeval , int val)
    {
        Node temp = head;
        while(temp.next!=null)//temp!=null insertion at last boom
        {
            if(temp.next.data ==beforeval)
                break;
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Element inserted before the given value");
        return head;
    }


    static void displayList(Node head)
    {
        Node dummy = head;
        System.out.print("Current list:");
        while(dummy!=null)
        {
            System.out.print(dummy.data+" ");
            dummy = dummy.next;
        }
        System.out.println();
    }

    static Node revByStack(Node head)
    {   Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(!stack.isEmpty())
        {
            temp.data = stack.pop();
            temp = temp.next;

        }
        return head;

    }

    static Node revList(Node head)
    {   
        Node prev = null;
        Node curr = head;
        while(curr!=null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
        deleteNode(head , 8);
        displayList(head);
        head = insertNode(head,30,3);
        displayList(head);
        head = insertNodeByElement(head,8,10);
        displayList(head);
        head = revByStack(head);
        displayList(head);
        head = revList(head);
        displayList(head);
    }
}
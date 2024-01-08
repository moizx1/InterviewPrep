public class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    public static class Node{
        int data;
        Node next;
        Node() {}
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void insert(int data){
        Node temp = new Node();
        temp.data= data;
        temp.next=null;

        if(head == null){
            head = temp;
        }


    }
    public static void display(){

    }

}
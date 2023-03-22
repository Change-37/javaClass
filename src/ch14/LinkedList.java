package ch14;

public class LinkedList implements List {
    private Node head;
    private int count;


    @Override
    public Node add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    @Override
    public void printAll(){
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp != null){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    @Override
    public Node remove(int position) {
        return null;
    }

    @Override
    public Node insert(int position, String data) {
        return null;
    }

    @Override
    public Node getElement(int position) {
        return null;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

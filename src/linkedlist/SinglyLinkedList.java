package linkedlist;

public class  SinglyLinkedList<T> {
    Node<T> head;

    public SinglyLinkedList(){
        head = null;
    }

    public void add(T value){
        // create new node
        Node<T> newNode = new Node<>(value, null);

        // check if it is the first element, then add new node
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        // else add to the head of list and set new node as head
    }

    public void delete(){
        head = head.next;
    }


}

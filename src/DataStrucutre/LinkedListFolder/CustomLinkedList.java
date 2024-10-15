package DataStrucutre.LinkedListFolder;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

// Simple comment
public class CustomLinkedList<T> implements Iterable<T> {
    private int size;
    private final int STARTING_POINT = 0;
    private  Node<T> head;
    private Node<T> tail;


    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;
            T value;
            @Override
            public boolean hasNext() {
                if(current == null){
                    return false;
                }
                return current != tail;
            }

            @Override
            public T next() {
                if(!hasNext()){
                    throw new NoSuchElementException("No  elements in List");
                }
                value = current.data;
                current = current.next;

                return value;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    public class Node<T>  {
        private T data ;
        private Node<T> next;
        private Node<T> prev;

      public Node(T data) {
          this.data = data;
          this.next = null;
          this.prev = null;
      }

      public T getData() {
          return data;
      }

      public Node<T> getNext() {
          return next;
      }

      public Node<T> getPrev() {
          return prev;
      }

      public void setNext(Node<T> next) {
          this.next = next;
      }

      public void setPrev(Node<T> prev) {
          this.prev = prev;
      }
  }
}

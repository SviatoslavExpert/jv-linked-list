package core.basesyntax;

import java.util.List;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size;
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T value) {
        Node node = new Node();
        node.element = value;
        node.next = null;
        //System.out.println(node);
        //node = new Node<T>(value);
        if (head == null) {
            head = node;
            size++;
            System.out.println(head.element);
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
                System.out.println(n.element);
            }
            size++;
            n.next = node;
        }
        System.out.println(head.element);
    }

    @Override
    public void add(T value, int index) {
    }

    @Override
    public void addAll(List<T> list) {
    }

    @Override
    public T get(int index) {
        Node currentNode = head;
        T result = null;
        while (currentNode.next != null) {
            int i = 0;
            if (i == index) {
                result = (T) currentNode;
            }
            currentNode = currentNode.next;
            i++;
        }
        return result;
    }

/*        T result = null;
        for (int i = 0; i <= index;  i++) {
            if (index == i) {
                result = (T) node.element;
            }
        }
        return result;*/

    @Override
    public void set(T value, int index) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T t) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node<T> {
        Node prev;
        T element;
        Node next;

    }
}

/*            Node<T> firstNode = new Node<>();
            Node<T> currentNode = firstNode;
            System.out.println(firstNode.element);
            //currentNode.next = (T) newNode;
            //currentNode.index++;*/

//if (size != 0) {

/*            for (int i = 0; i < size; i++){
                if (index == i) {
                    Node<T> newNode = new Node<>(value);
                    currentNode.next = (T) newNode;
                    //currentNode.index++;
                    size++;
                }
            }*/
//currentNode.prev = get(size - 1);
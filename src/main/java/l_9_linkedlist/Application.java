package l_9_linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Node<String> firstNode = new Node<>(null, "1" , null);
        Node<String> secondNode = new Node<>(firstNode, "2" , null);
        firstNode.next = secondNode;
        Node<String> thirdNode = new Node<>(secondNode, "3", null);
        secondNode.next = thirdNode; //  null <- 1 <-> 2 <-> 3 -> null

        Node<String> fifthNode = new Node<>(firstNode, "5" , secondNode);
        firstNode.next = fifthNode;
        secondNode.prev = fifthNode;


        thirdNode.prev = fifthNode;
        fifthNode.next = thirdNode;
        secondNode = null;

    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }
}

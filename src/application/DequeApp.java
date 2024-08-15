package application;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.offerFirst("Didik");
        stack.offerFirst("Nur");
        stack.offerFirst("Hidayat");

        System.out.println(stack.pollFirst());
        System.out.println(stack);
        System.out.println(stack.pollFirst());
        System.out.println(stack);
        System.out.println(stack.pollFirst());
        System.out.println(stack);

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Didik");
        deque.offerLast("Nur");
        deque.offerLast("Hidayat");

        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}

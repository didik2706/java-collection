package application;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(10); Queue with array
//        Queue<String> queue = new PriorityQueue<>(); Queue with priority or ordered element
        Queue<String> queue = new LinkedList<>(); // Queue with LinkedList

        queue.add("Didik");
        queue.add("Nur");
        queue.add("Hidayat");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}

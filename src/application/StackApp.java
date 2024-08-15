package application;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("data1");
        stack.push("data2");
        stack.push("data3");

        try {
            for (var value = stack.pop(); value != null; value = stack.pop()) {
                System.out.println(value);
            }
        } catch (EmptyStackException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

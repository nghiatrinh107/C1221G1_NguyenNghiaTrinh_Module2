package ss10_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);
        System.out.println(integers);
        while (!integers.isEmpty()) {
            stack.push(integers.peek());
            integers.pop();
        }
        System.out.println(stack);
        Stack<String> strings = new Stack<>();
        Stack<String> wStack = new Stack<>();
        strings.push("trinh");
        strings.push("hinh");
        strings.push("minh");
        strings.push("binh");
        strings.push("xinh");
        System.out.println(strings);
        while (!strings.isEmpty()) {
            wStack.push(strings.peek());
            strings.pop();
        }
        System.out.println(wStack);
    }

}

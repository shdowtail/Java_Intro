import java.util.Stack;

public class StackPushPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Stack push\n\t_>");

        stack.push("bottom");
        printStack(stack);
        stack.push("2");
        printStack(stack);
        stack.push("3");
        printStack(stack);

        System.out.println("Stack pop\n\t_>");

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s) {
        if (s.isEmpty()) System.out.println("You have nothing in your stack");
        else System.out.printf("%\ttop\n", s);
    }
}

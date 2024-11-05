import java.util.Scanner;

public class Stack {
    int top;
    char[] elements;
    int size;

    public Stack(int size) {
        this.size = size;
        elements = new char[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(char element) {
        if (isFull()) {
            System.out.println("Стек переполнен!");
            return;
        }
        elements[++top] = element;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст!");
            return '\0';
        }
        return elements[top--];
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String s = c.nextLine();
        int size = s.length();
        Stack stack = new Stack(size);

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        System.out.print("Выведенная последовательность в обратном порядке: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}

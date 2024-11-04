import java.util.Scanner;

public class Stack {
    private int top;
    private char[] elements;
    private int size;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String inputString = scanner.nextLine();
        int size = inputString.length();
        Stack stack = new Stack(size);

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        System.out.print("Выведенная последовательность в обратном порядке: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}

package JavaBase.CollectionAndFrame.StackExample;

import Utils.MyStack;

public class MyStackExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("当前栈内容: ");
        stack.printMyStack();

        System.out.println("弹出元素: " + stack.pop());

        System.out.println("弹出后栈内容: ");
        stack.printMyStack();
    }
}

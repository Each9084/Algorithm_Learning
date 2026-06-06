package Utils;


public class MyStack {
    private int arr[];
    private int top;
    private int capacity;

    public MyStack(int size){
        arr = new int[size];
        capacity= size;
        top = -1;
    }

    public void push(int x){
        if (isFull()){
            System.out.println("溢出：栈已经满了！");
            return;
        }
        System.out.println("压入元素: " + x);
        arr[++top] = x; // 先把指针往上挪一格，再把货放进去
    }

    public boolean isFull() {
        return top == capacity-1;
    }


    public int pop(){
        if(isEmpty()){
            System.out.println("空栈：没东西可弹了！");
            return -1;
        }
        return arr[top--];// 先把货拿出来，再把指针往下挪一格
    }

    public boolean isEmpty() {
        return top ==-1;
    }

    public int size(){
        return top+1;
    }

    public void printMyStack(){
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

}



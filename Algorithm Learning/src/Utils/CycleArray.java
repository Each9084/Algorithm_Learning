package Utils;

public class CycleArray<T> {
    private T[] arr;
    private int start;
    private int end;
    private int count;
    private int size;

    //可以不写无参,但是这样每次都必须写一个确定的值类似于new CycleArray(10)
    //所以不如写了无参但是让有参处理一个默认的初始值 用户直接写 new CycleArray(),然后系统自动给个默认值
    public CycleArray() {
        //这里因为1是int类型所以就会自动丢给底下的有参(int size)处理,写1是最小默认,节省地方,想写10 1000(太占地方了)都可以
        this(1);
    }

    public CycleArray(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        this.start = 0;
        this.end = 0;
        this.count = 0;
    }


    // 自动扩缩容辅助函数
    private void resize(int newSize){
        T[] newArr = (T[])new Object[newSize];
        for (int i = 0; i < count; i++) {
            //这里还用取模是因为 可以跳到 [ E, _, B, C, D ] 里的E所在的地方,
            // 从而形成新的[ B, C, D, E, _, _, _, _, _, _ ]
            newArr[i] = arr[(start+i)%size];
        }
        arr = newArr;
        start = 0;
        end = count;
        size = newSize;

    }


    public void addFirst(T val){
        if(isFull()){
            resize(size*2);
        }
        //左边是闭区间,然后往前插入,就要-1
        start = (start-1+size)%size;
        arr[start] = val;
        count++;
    }

    public void removeFirst(){
        if (isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        arr[start] = null;
        start = (start + 1 + size)%size;
        count --;
        // 如果数组元素数量减少到原大小的四分之一，则减小数组大小为一半
        if (count>0 && count == size/4){
            //这里的count>0是防止数组刚产生就会为0,举例count为0,size为3,此时不加>0就会直接触发 因为resize(这时条件只有count==3/4)而3/4会变成0满足
            //resize里的参数会变成新的size,于是此时size为0,而取模运算中size会作为分母,分母为0会触发ArithmeticException: / by zero。
            resize(size/2);
        }

    }

    // 获取数组头部元素，时间复杂度 O(1)
    public T getHead(){
        if (isEmpty()){
            throw new IllegalStateException("Array is empty");
        }

        return arr[start];
    }

    public T getLast(){
        if (isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        return arr[(end-1+size)%size];
    }


    public void addLast(T val){
        if(isFull()){
            resize(size*2);
        }
        // 因为 end 是开区间，所以是先赋值，再右移
        arr[end] = val;
        end = (end + 1 )%size;
        count++;
    }

    public void removeLast(){
        if (isEmpty()){
            throw new IllegalStateException("Array is empty");
        }
        end = (end-1 +size)%size;
        arr[end] = null;
        count--;
        if (count> 0 && count==size/4){
            resize(size/2);
        }
    }


    public boolean isEmpty() {
        return count==0;
    }

    public boolean isFull() {
        return count == size;
    }
}

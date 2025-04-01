## 基础学习

### 二分查找

#### <span style = "color : red">为什么不能i =m j=m,而是要+1 -1?</span>

```
int [] example = {1,2,3,4,5,6,7,8,9};
int target = 9;
```



```java
private static int binarySearch(int[] example, int target) {
        int i = 0;
        int j = example.length-1;

        while(i<=j){
            int m = i+j >>1;
            if (target >example[m] ){
                i = m;
            }else if (target <example[m]){
                j = m;
            }else {
                return m;
            }
        }
        return -1;
    }
```



##### 流程模拟：

初始时：
 `i = 0`，`j = 8`（因为 `example.length = 9`，所以 `j = 8`）

##### 第1次循环：

- **`i = 0`, `j = 8`**
- 计算中点：`m = (i + j) / 2 = (0 + 8) / 2 = 4`
- `example[4] = 5`
- 目标值 `target = 9`，所以 `9 > 5`，进入 `if (target > example[m])`，执行 `i = m`，因此 `i = 4`。

##### 第2次循环：

- **`i = 4`, `j = 8`**
- 计算中点：`m = (i + j) / 2 = (4 + 8) / 2 = 6`
- `example[6] = 7`
- 目标值 `target = 9`，所以 `9 > 7`，进入 `if (target > example[m])`，执行 `i = m`，因此 `i = 6`。

##### 第3次循环：

- **`i = 6`, `j = 8`**
- <span style = "color :red" >计算中点：`m = (i + j) / 2 = (6 + 8) / 2 = 7`</span>
- `example[7] = 8`
- 目标值 `target = 9`，所以 `9 > 8`，进入 `if (target > example[m])`，执行 `i = m`，因此 `i = 7`。

##### 第4次循环：

- **`i = 7`, `j = 8`**
- <span style = "color : red">计算中点：`m = (i + j) / 2 = (7 + 8) / 2 = 7`</span>
- `example[7] = 8`
- 目标值 `target = 9`，所以 `9 > 8`，进入 `if (target > example[m])`，执行 `i = m`，因此 `i = 7`。

##### 死循环开始：

- 此时 `i = 7`，`j = 8`，但 `m` 仍然是 `7`，`example[7] = 8`。
- 每次计算 `m = (i + j) / 2 = 7`，并且 `i = m`，所以 `i` 会一直停留在 `7`，无法收敛，导致死循环。

##### 结论：

因为在每次循环中，我们将 `i` 设置为 `m`，而 `m` 并没有变得更加接近目标。此时 `i` 和 `j` 不会收敛，`i` 一直停留在 `7`，导致搜索范围无法进一步缩小，从而进入死循环。

##### 为什么会死循环？

- 在二分查找中，**每次都要排除已经检查过的元素**，这就需要通过更新 `i` 为 `m + 1` 或 `j` 为 `m - 1` 来缩小搜索范围。
- 如果我们直接设置 `i = m` 或 `j = m`，就没有排除中间的元素，导致 `i` 和 `j` 始终不变，搜索范围无法缩小，程序进入死循环。

#### 正确的做法：

应该使用 `i = m + 1` 或 `j = m - 1` 来排除已经检查过的元素，确保搜索范围收敛。

```
java复制if (target > example[m]) {
    i = m + 1;  // 搜索右半部分
} else if (target < example[m]) {
    j = m - 1;  // 搜索左半部分
}
```

这样才能保证程序最终停止并找到目标元素，或者确定目标不存在。
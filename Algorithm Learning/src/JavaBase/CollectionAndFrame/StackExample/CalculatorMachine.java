package JavaBase.CollectionAndFrame.StackExample;

import java.util.Stack;

public class CalculatorMachine {
    // 工具 1：定地位（优先级）
    public static int priority(char op){
        if(op=='*' || op == '/') return 2;// 大佬，先算
        if (op=='+' || op=='-') return 1;// 小弟，后算
        return 0;// 括号或无效字符
    }

    //工具 2：动手算
    public static int calculate(int b,int a,char op){
        switch (op){
            case '+':return a+b;
            case '-':return a-b;// 注意：先弹出的 b 是减数
            case '*':return a*b;
            case '/':return a/b;
        }
        return 0;
    }


    public static int solve(String expression){
        //numStack（数字栈）
        Stack<Integer> numStack = new Stack<>();
        //（符号栈）：存放加工指令（$+、-、*、/$）。
        Stack<Character> opStack = new Stack<>();


        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // 遇到数字：直接入数字栈,同时简单处理个位数
            if (Character.isDigit(c)){
                //如果c是2,那么不-'0',由于字符 '2' 的编号是 50,实际上会得到 50而不是2
                numStack.push(c-'0');
            }

            //如果是左括号 左括号 (：它是“特权符号”，直接进符号栈，哪怕它优先级是 0。
            else if (c=='(') {
                opStack.push(c);
            }

            //右括号 )：它是“结算信号”。一旦看到它，就命令工厂：“把最近的一个左括号之后的所有算式都给我算了！”
            else if (c==')'){
                while (opStack.peek() != '('){// 只要还没碰到左括号，就一直算
                    numStack.push(calculate(numStack.pop(),numStack.pop(),opStack.pop()));
                }
                opStack.pop();// 最后把那个碍事的左括号也扔了
            } //遇到普通符号 ($+、-、*、/$)：最关键的逻辑！
            else if (c=='+' || c =='-' || c =='*' || c== '/') {
                // 只要【栈顶符号】的优先级比【当前符号】高或相等，就先算栈顶的
                while (!opStack.isEmpty()&&priority(opStack.peek())>=priority(c)){
                    numStack.push(calculate(numStack.pop(),numStack.pop(),opStack.pop()));
                }// 算完了（或者当前符号更牛逼），当前符号再入栈
                opStack.push(c);
            }
        }

        //收尾工作（清空仓库）,当字符串读完了，符号栈里可能还有剩下的符号（比如最前面的那个加号）。
        while (!opStack.isEmpty()){
            numStack.push(calculate(numStack.pop(),numStack.pop(),opStack.pop()));

        }
        return numStack.pop();// 数字栈最后剩下的那一个数，就是最终答案
    }

    public static void main(String[] args) {
        String exp ="2+5/3*(6-2)";
        System.out.println("结果是: " + solve(exp));
    }
}

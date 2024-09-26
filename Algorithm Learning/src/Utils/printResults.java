package Utils;

public class printResults {

    private printResults(){};

    public static void printResult(int[] result) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i< result.length-1) {
                System.out.print(result[i]+",");
            }else {
                System.out.print(result[i]);
            }


        }
        System.out.print("]");
    }

    public static void compareResultAndInit(int[]init,int[]result){
        System.out.println("初始排列为:");
        System.out.print("[");
        for (int i = 0; i < init.length; i++) {
            if (i< init.length-1) {
                System.out.print(init[i]+",");
            }else {
                System.out.print(init[i]);
            }


        }
        System.out.print("]");

        System.out.println("");
        System.out.println("使用算法后的结果为:");

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i< result.length-1) {
                System.out.print(result[i]+",");
            }else {
                System.out.print(result[i]);
            }


        }
        System.out.print("]");
    }
}

package JavaBase.array;

import java.util.Arrays;

public class arrayDuplication {

    public static void main(String[] args) {

        /*int [] array1 = {1,2,3};
        int [] array2 = {4,5,6};

        int [] duplicationArray=new int[array1.length+array2.length];
        System.arraycopy(array1,0,duplicationArray,0,array1.length);
        System.out.println(Arrays.toString(duplicationArray));

        System.arraycopy(array2,0,duplicationArray,array1.length,array2.length);
        System.out.println(Arrays.toString(duplicationArray));*/


        int [] newArray1 = {1,2,3};
        int [] newArray2 = {4,5,6};


        int [] newDuplicationArray = new int[newArray1.length+newArray2.length];

        int index = 0;
        for (int element:newArray1){
            newDuplicationArray[index++] =element;
        }
        System.out.println(Arrays.toString(newDuplicationArray));

        for (int element:newArray2){
            newDuplicationArray[index++]=element;
        }

        System.out.println(Arrays.toString(newDuplicationArray));
    }
}

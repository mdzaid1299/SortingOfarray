import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50,40,10,5,2,1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //print array
                System.out.println("before " + Arrays.toString(arr));
                //check adjacent elements
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("after " + Arrays.toString(arr));
            }
            System.out.println();
            System.out.println("after "+ (i+1) +"  pass" + Arrays.toString(arr));
            System.out.println();
        }
    }
}

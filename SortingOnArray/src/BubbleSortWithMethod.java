import java.util.Arrays;

public class BubbleSortWithMethod {
    public int[] bubbleSort(int[] arrayToBeSorted) {
        for (int i = 0; i < arrayToBeSorted.length; i++) {
            for (int j = 0; j < arrayToBeSorted.length - 1 - i; j++) {
                if(arrayToBeSorted[j] > arrayToBeSorted[j+1]){
                    int temp = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j+1];
                    arrayToBeSorted[j+1] = temp;
                }
            }

        }
        return arrayToBeSorted;
    }

    public static void main(String[] args) {
        int[] arr = {50,40,10,5,2,1};
        BubbleSortWithMethod object = new BubbleSortWithMethod();
        int[] sortedArray = object.bubbleSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }
}

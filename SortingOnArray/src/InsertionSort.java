public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,50,6,9,1,7};
        InsertionSort obj = new InsertionSort();
        int[] sortedArray = obj.insertionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + ", ");
        }
    }
    public int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
        }
        return array;
    }
}

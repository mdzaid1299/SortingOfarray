import java.util.Arrays;

public class InsertionSortStudentRollNo {
    public static void main(String[] args) {
        int[] arr = {10,50,6,98,78,45,12,3,5,19};
        InsertionSortStudentRollNo obj = new InsertionSortStudentRollNo();
        int[] sortedArray = obj.insertionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
    }
    public int[] insertionSort(int[] rollNumbers){
        for (int i = 1; i < rollNumbers.length ; i++) {
            System.out.println("before = " + Arrays.toString(rollNumbers));
            int key = rollNumbers[i];
            System.out.println("key = " + key);
            int j = i - 1;
            while( j >= 0 && rollNumbers[j] > key){
                rollNumbers[j+1] = rollNumbers[j];
                j--;
                System.out.println("inside while = " + Arrays.toString(rollNumbers));
            }
            rollNumbers[j+1] = key;
            System.out.println("after = " + Arrays.toString(rollNumbers));
            System.out.println();
        }
        return rollNumbers;
    }
}

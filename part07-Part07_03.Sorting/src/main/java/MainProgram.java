
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
// indices:       0  1  2  3   4
    int[] numbers = {-1, 6, 9, 8, 12};
    System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
    System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
    System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }
    
    public static int smallest(int[] array){
        int smal = array[0];
        
        for (int i = 0; i < array.length; i++){
            if (array[i] < smal){
                smal = array[i];
            }
        }
        return smal;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest  = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                return i;
            }
        } return index -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int[] newArray = new int[table.length - startIndex];
        int ii = 0;
        for (int i = startIndex; i < table.length; i++){
            newArray[ii] = table[i];
            ii++;
        }
        int ans = indexOfSmallest(newArray);
        return startIndex + ans;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}

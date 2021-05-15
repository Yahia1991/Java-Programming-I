
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
   }
    
    public static int smallest(int[] array){
        int smallestValue = array[0];
        int i = 0;
        while (i < array.length){
            if(array[i] < smallestValue){
                smallestValue = array[i];
            }
            i++;
        }
        return smallestValue;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestValue = smallest(array);
        int smallestIndex = 0;
        int i = 0;
        while (i < array.length){
            if (array[i] == smallestValue){
                smallestIndex = i;
            }
            i++;
        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startingIndex){
        int smallestIndex = startingIndex;
        int smallestValue = table[startingIndex];
        while(startingIndex < table.length){
            if(smallestValue > table[startingIndex]){
                smallestValue = table[startingIndex];
                smallestIndex = startingIndex;
            }
            startingIndex++;
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int helper1 = array[index1];
        int helper2 = array[index2];
        array[index2] = helper1;
        array[index1] = helper2; 
    }
    
    public static void sort(int[] array){
       int i = 0;
       while (i < array.length){
           System.out.println(Arrays.toString(array));
           int smallestIndexFrom = indexOfSmallestFrom(array, i);
           swap(array, i, smallestIndexFrom);
           i++;
       }
    }    
}

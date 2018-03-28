import java.util.ArrayList;

/**
 * Reverses a sqaure matrix.
 * Created by kylel95 on 3/27/18.
 */
public class reversediagonal {
    public static void main(String [] args){
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        printArray(arr);

    }

    /**
     * Reverses the 2d array
     * @param arr
     * @return 2d array reversed
     */
    public static int[][] diagreverse(int[][] arr){
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        //gets entries from top left -> bottom right
        for(int i = 0; i < arr.length; i++){
            left.add(arr[i][i]);
        }
        for(int i = arr.length -1; i >= 0; i--){
            arr[i][i] = left.get(leftIndex);
            leftIndex++;
        }

        System.out.println();
        int index = arr.length - 1;
        //gets entries from top right -> bottom left
        for(int i = 0; i < arr.length; i++){
            right.add(arr[i][index]);
            index--;
        }

        for(int i = arr.length - 1; i >= 0; i--){
            arr[i][rightIndex] = right.get(rightIndex);
            rightIndex++;
        }
        return arr;

    }
    /**
     * Prints the reversed the 2d array
     * @param arr 2d array
     */
    public static void printArray(int[][] arr){
        if(arr.length == 0){
            System.out.print("Empty array.");
            return;
        }
        int count = -1;
        arr = diagreverse(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                count++;
                System.out.print(arr[i][j] + " ");
                if(count == arr.length - 1)
                {
                    System.out.println("");
                    count = -1;
                }


            }
        }

    }
}

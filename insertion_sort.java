public class insertion_sort {
    public static void main(String[] args){
        int[] arr = insertionSort(new int[]{6, 3, 4, 34, 9, 1, 5, 2});

        //In Java, when you print an array directly using System.out.println(), it will print the default toString() representation of the array, which is in the format of "[I@<hashcode>".
        // To print the sorted array instead of the default toString() representation, you need to loop through the array and print each element separately.
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
    
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    
}

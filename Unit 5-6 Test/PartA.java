import java.util.Arrays;

public class PartA {
public static void main(String[] args) {
    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    swap(2, 7, numbers);
    System.out.println(Arrays.toString(numbers));
}
public static void swap(int index1,int index2, int[] arr){
    if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    } 
    
}

}


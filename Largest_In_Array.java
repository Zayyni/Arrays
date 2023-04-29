import java.util.*;
//Largest number in Array
public class Largest_In_Array {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] ={1,2,6,3,5};

        System.out.println("Largest in array is :"+getLargest(numbers));
    }
    
}

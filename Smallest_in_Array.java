import java.util.*;
//Smallest in Array
public class Smallest_in_Array {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] ={1,2,6,3,5};

        System.out.println("Largest in array is :"+getSmallest(numbers));
    }
    
}

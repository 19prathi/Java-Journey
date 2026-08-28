package Arrays;

public class Largest {
    public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 18};
        System.out.println("Largest number is " + GetLargest(numbers));
    } 
}

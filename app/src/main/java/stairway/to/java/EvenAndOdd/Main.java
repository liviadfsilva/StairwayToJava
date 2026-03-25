package stairway.to.java.EvenAndOdd;

public class Main {
    public static void main(String[] args) {

        int[] input = {0};

        int evenCount = 0;
        int oddCount = 0;

        String evenOutput = "even number";
        String oddOutput = "odd number";

        for (int i : input) {
            if(i % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }            
        }

        if (evenCount > 1 || evenCount == 0) {
            evenOutput = "even numbers";
        }

        if (oddCount > 1 || oddCount == 0) {
            oddOutput = "odd numbers";
        }

        System.out.println(evenCount + " " + evenOutput + ", " + oddCount + " " + oddOutput);
    }
}

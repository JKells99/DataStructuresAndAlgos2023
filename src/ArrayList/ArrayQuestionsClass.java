package ArrayList;

// Create a function that calculates the sum and products of elements in an array
// Create  a function which print to the cosole the pairs from a given array
// EX, [1,2,4,5]  => [11,12,14.15] =>
public class ArrayQuestionsClass {

    public static void main(String[] args) {

        ArrayQuestionsClass arrayQuestion = new ArrayQuestionsClass();

        int[] customArray = {1,2,3,4};

        arrayQuestion.sumAndProduct(customArray);
        arrayQuestion.printPairs(customArray);


    }

    void sumAndProduct(int[] array){
        int sum = 0;
        int product = 1;



        for (int k : array) {
            sum += k;

        }

        for (int j : array) {
            product *= j;

        }

        System.out.println("The Sum Of The Array Is: " + sum);
        System.out.println("The Product Of the Array Is: " + product);
    }

    void printPairs(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {

                System.out.print(array[j] + " ," + array[i]);

            }

        }
    }
}

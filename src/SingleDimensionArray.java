public class SingleDimensionArray {

    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;

        }



    }

//    arr = [3,5,7,4,8]



    public void insert(int location, int valueToBeInserted){

        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Sucessfully Inserted ");
            } else{
                System.out.println("This Cell is alreadt occupied");
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to access array");

        }


    }
    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }

    }

//     Search for an element  in the given array

    public void searchArray(int valueToSearch){

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] == valueToSearch){
                System.out.println("Number has been found!" + i);
                return;
            }
            System.out.println("Value could not be found");
        }

    }

//    Delete value from an array

    public void deleteValue(int valueToDelete){
        try{

            arr[valueToDelete] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted!");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value could no be deleted...");

        }
    }
}

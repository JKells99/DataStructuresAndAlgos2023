import java.util.Arrays;

public class TwoDimensionalArray {

        int arr[][] = null;

//        constructor

    public TwoDimensionalArray(int numOfRows, int numOfColumns){
        this.arr = new int[numOfRows][numOfColumns];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;

            }

        }
    }

    public void insert(int location,int location2, int valueToBeInserted){

        try{
            if(arr[location][location2] == Integer.MIN_VALUE){
                arr[location][location2] = valueToBeInserted;


                System.out.println("Sucessfully Inserted ");
            } else{
                System.out.println("Cell at index (" + location + ", " + location2 + ") is already occupied");
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to access array");

        }


    }



    public void traverseArray(){

        try{
            for (int i = 0; i < arr.length ; i++) {

                for (int j = 0; j < arr[i].length ; j++) {
                    System.out.println(arr[i][j]);
                }


            }

        } catch(Exception e){
            System.out.println("Array no loger exist!");

        }

    }

    public void searchArray(int valueToSearch){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if(arr[i][j] == valueToSearch){
                    System.out.println( valueToSearch +" has been found at position!" + i + "," + j);
                    return;
                }

            }


            System.out.println("Value could not be found");
        }

    }

    public void accessSpecificCell(int location1, int location2){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if(i == location1 && j == location2){
                    System.out.println("The Value at position " + location1 +"," +  location2 + " is " + arr[i][j]);
                    return;
                }

            }


            System.out.println("Value could not be found");
        }
    }

    public void deleteValue(int valueToDelete, int value2){
        try{

            arr[valueToDelete][value2] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted!");

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value could no be deleted...");

        }
    }

//    insert values.....
//    Accessing cell value from given array
//    traverse a 2d array ...
//    search a single value from the array
//    delete a value from the array
}

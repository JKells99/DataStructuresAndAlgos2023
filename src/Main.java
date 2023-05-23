import java.util.Arrays;

public class Main {
    /**
     *  single array {1 dimensional}  arr = {1,3,4,5,6,7}
     * 1. Declare the array varible
     * 2. Instaniate
     * 3. Initilize the array
     *
     * **/


    public static void main(String[] args) {

//        SingleDimensionArray sda = new SingleDimensionArray(5);
//
//
//        sda.insert(0,10);
//        sda.insert(1,20);
//        sda.insert(2,30);
//        sda.insert(3,40);
//        sda.insert(4,50);
//
//
//        System.out.println(Arrays.toString(sda.arr));
//
//        sda.traverseArray();
//
//        sda.searchArray(10);
//
//      sda.deleteValue(2);
//      System.out.println(Arrays.toString(sda.arr));

      TwoDimensionalArray tda = new TwoDimensionalArray(2,4);


        tda.insert(0,0,50);
        tda.insert(0 ,1,60);
        tda.insert(0,2,63);
        tda.insert(0,3,66);

        tda.insert(1,0,66);
        tda.insert(1,1,66);
        tda.insert(1,2,66);
        tda.insert(1,3,66);


//
//        System.out.println(Arrays.deepToString(tda.arr));
//
//        tda.traverseArray();
//
//        tda.searchArray(63);

        tda.accessSpecificCell(0,1);

//        tda.deleteValue(0,0);
//        tda.deleteValue(0,1);


        System.out.println(Arrays.deepToString(tda.arr));





//        double jan = 10.4;
//        double december = 50;
//
//
//
//        double[] averageTemp = {10.4,45.0,12.4};
//
//        double sum = 0;
//
//        for (double temps : averageTemp) {
//
//            sum += temps;
//
//        }
//
//        double average = sum / averageTemp.length;





    }
}

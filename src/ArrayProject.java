import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How Many Days Do You Want TO calculate the average for ? ");

        int numberOfDays = console.nextInt();

        int[] temps = new int[numberOfDays];

        int sum = 0;

        for (int i = 0; i < numberOfDays ; i++) {
            System.out.println("Day" + (i+1) + " 's high temp:");
            temps[i] = console.nextInt();
            sum+= temps[i];

        }

        double average = sum / numberOfDays;

//        count how many days were above average

        int above = 0;

        for (int i = 0; i < temps.length ; i++) {

            if(temps[i] > average){
                above ++;
            }

        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println("Days Abover average " +  above);
    }
}

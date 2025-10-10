import java.util.Scanner;
import java.util.Arrays;
public class Sort {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Input " + n + " elements: ");
        for (int i=0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        System.out.println("Sum: " + sum);
        double avg = (double)sum/n;
        System.out.println("Average :" + avg);
    }
}

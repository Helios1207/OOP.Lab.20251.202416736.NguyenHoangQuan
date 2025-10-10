import java.util.Scanner;
public class AddMatrices {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Import number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Import number of columns: ");
        int c = scanner.nextInt();
        int [][]A = new int[r][c];
        int [][]B = new int[r][c];
        int [][]C = new int[r][c];
        System.out.println("Import the first matrix: ");
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Import the second matrix: ");
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

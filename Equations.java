import java.util.Scanner;
public class Equations {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.print("Choose equation to solve:" +
                "\n Choose 1 to solve first-degree equation with one variable" +
                "\n Choose 2 to solve first-degree equation with two variables" +
                "\n Choose 3 to solve second-degree equation with one variable" +
                "\n Please input the number: ");
        int temp = scanner.nextInt();
        if (temp==1){
            Solve1(scanner);
        } else if (temp==2) {
            Solve2(scanner);
        } else if (temp==3) {
            Solve3(scanner);
        } else {
            System.out.println("Your input is not correct! ");
        }
    }
    private static void Solve1 (Scanner scanner){
        System.out.println("Input two numbers a,b for the eq ax+b=0: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a == 0 && b == 0){
            System.out.println("The equation has infinite solution!");
        } else if (a == 0 && b != 0) {
            System.out.println("The equation has no solution!");
        } else{
            double c = -b / a;
            System.out.println("The solution of the equation is: x = " + c);
        }
    }
    private static void Solve2 (Scanner scanner){
        System.out.println("Input three numbers a,b,c for the eq ax+by+c=0: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Solve the equation :" + a + "x + " + b + "y + " + c + " = 0");
        if (a*b==0){
            if (c==0){
                System.out.println("The equation has infinite solution!");
            } else {
                System.out.println("The equation has no solution!");
            }
        } else {
            System.out.println("The equation has infinite solution!");
        }
    }
    private static void Solve3 (Scanner scanner){
        System.out.println("Input two numbers a,b for the eq ax^2+bx+c=0: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Solve the equation : " + a + "x^2 + " + b + "x + " + c  + "= 0");
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("The equation has infinite solution!");
                } else {
                    System.out.println("The equation has no solution!");
                }
            } else {
                System.out.println("The equation has one solution is x=" + -c/b);
            }
        } else {
            double delta = b*b - 4*a*c;
            if (delta<0) System.out.println("The equation has no solution!");
            else if (delta==0) System.out.println("The equation has one solution is x=" + -b/(2*a));
            else{
                double temp1 = (-b + Math.sqrt(delta)) / (2*a);
                double temp2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("The equation has two solutions are x1 =" + temp1 + " and x2= " + temp2);
            }
        }
    }
}
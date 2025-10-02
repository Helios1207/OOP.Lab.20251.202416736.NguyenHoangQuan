import javax.swing.JOptionPane;
public class TwoDoubleNumbers {
    public static void main (String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Input the first number: ");
        strNum2 = JOptionPane.showInputDialog(null, "Input the second number: ");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double s = num1 + num2 ;
        JOptionPane.showMessageDialog(null,
                "Sum of two numbers is :" + s);
        double d = num1 - num2;
        JOptionPane.showMessageDialog(null,
                "Difference of two numbers is: " + d);
        double p = num1 * num2;
        JOptionPane.showMessageDialog(null,
                "Product of two numbers is: " + p);
        if (num2==0){
            JOptionPane.showMessageDialog(null,
                    "There is no quotient ");
        } else {
            double q = num1/num2;
            JOptionPane.showMessageDialog(null,
                    "Quotient of two numbers is: " + q);
        }
        System.exit(0);
    }
}

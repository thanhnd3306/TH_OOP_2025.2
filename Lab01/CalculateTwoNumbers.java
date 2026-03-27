//Example 5: CalculateTwoNumbers.java
import javax.swing.JOptionPane;
public class CalculateTwoNumbers{
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        // Sum of the numbers
        System.out.print("Sum of the numbers: ");
        System.out.print(num1 + num2);
        System.out.println();

        // Different of the numbers
        System.out.print("Different of the numbers: ");
        System.out.print(num1 - num2);
        System.out.println();

        // Product of the numbers
        System.out.print("Product of the numbers: ");
        System.out.print(num1 * num2);
        System.out.println();

        // Quotient of the numbers
        if(num2 == 0) {
            System.out.print("Division by zero is not allowed.");
            System.out.println();
        } else {
            System.out.print("Quotient of the numbers: ");
            System.out.print(num1 / num2);
            System.out.println();
        }
        System.exit(0);
    }
}
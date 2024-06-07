
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String strVar = JOptionPane.showInputDialog("Entre com um numero");
        //Store the input as a String and print it.
        System.out.println(strVar);
        
        
        //Parse the input as an int.
        int intVar = Integer.parseInt(strVar);
        //Print its value +1
        intVar++;
        System.out.println(intVar);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}

import javax.swing.*;

/**
 * Aufgabe 2 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class Loops {
    public static void main(String args[]) {
        // a) for schleife
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

        // b) while schleife
        while (true) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Zahl: "));

            if (number > 0 && number < 11) {
                System.out.println(number);
                break;
            }
        }
    }
}

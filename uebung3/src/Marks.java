import javax.swing.*;

/**
 * Aufgabe 1 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class Marks {
    public static void main(String args[]) {
        int mark = Integer.parseInt(JOptionPane.showInputDialog("Note: "));

        // a)
        switch (mark) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Keine gültige Schulnote");
        }

        // b)
        switch (mark) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Bestanden");
                break;
            case 5:
            case 6:
                System.out.println("Nicht Bestanden");
                break;
            default:
                System.out.println("Keine gültige Schulnote");
        }

        if (mark >= 1 && mark <= 4) {
            System.out.println("Bestanden");
        } else if (mark == 5 || mark == 6) {
            System.out.println("Nicht Bestanden");
        } else {
            System.out.println("Keine gültige Schulnote");
        }
    }
}

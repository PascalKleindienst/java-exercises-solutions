import javax.swing.*;

/**
 * Aufgabe 4 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class BattleShip {
    public static void main(String[] args) {
        // a) 10x10 Feld mit 0 initialisieren
        int[][] field = new int[10][10];

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                field[i][j] = 0;
            }
        }

        // c) schleife zum setzen der schiffe
        int shipsToSet = 7;

        while (shipsToSet > 0) {
            // d) Eingaben
            String alignment = JOptionPane.showInputDialog("Ausrichtung des Schiffs [W/S]: ");
            int row = Integer.parseInt(JOptionPane.showInputDialog("Zeile des mittleren Feldes des Schiffes: "));
            int column = Integer.parseInt(JOptionPane.showInputDialog("Reihe des mittleren Feldes des Schiffes: "));

            // wir beginnen bei 0 mit dem zählen
            row -= 1;
            column -= 1;

            // e) überprüfe ob eingaben korrekt sind
            // überprüfe ob array grenzen korrekt sind
            boolean boundaries = false;
            if (alignment.toLowerCase().equals("w")) {
                boundaries = row >= 0 && row < 10 && column > 0 && column < 9;
            } else if (alignment.toLowerCase().equals("s")) {
                boundaries = row > 0 && row < 9 && column >= 0 && column < 10;

            }
            // überprüfe position des schiffs nicht besetzt ist
            boolean shipPosition = false;
            if (boundaries && alignment.toLowerCase().equals("w")) {
                shipPosition = field[row][column] == 0 && field[row][column - 1] == 0 && field[row][column + 1] == 0;
            } else if (boundaries && alignment.toLowerCase().equals("s")) {
                shipPosition = field[row][column] == 0 && field[row - 1][column] == 0 && field[row + 1][column] == 0;
            }

            // überprüfe ob eingaben korrekt sind,
            if ((alignment.toLowerCase().equals("w") || alignment.toLowerCase().equals("s")) && boundaries && shipPosition) {
                // verringere anzahl der noch zu setzenden schiffe um 1
                shipsToSet--;

                // setze position des schiffes
                if (alignment.toLowerCase().equals("w")) {
                    field[row][column] = 1;
                    field[row][column - 1] = 1;
                    field[row][column + 1] = 1;
                } else {
                    field[row][column] = 1;
                    field[row - 1][column] = 1;
                    field[row + 1][column] = 1;
                }

                continue;
            }

            // flasche angaben
            System.out.println("Falsche angaben");
        }

        // b) Ausgabe des Spielfeldes
        System.out.println("------------");
        for (int i = 0; i < 10; ++i) {
            System.out.print("|");
            for (int j = 0; j < 10; ++j) {
                System.out.print(field[i][j]);
            }
            System.out.print("|\n");
        }
        System.out.print("------------");
    }
}

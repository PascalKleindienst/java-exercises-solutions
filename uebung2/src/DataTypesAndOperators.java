/**
 * Aufgabe 5 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class DataTypesAndOperators {
    public static void main(String args[]) {
        /**
         * Teil a)
         * Ausgabe: false
         * Grund: number3 ist nicht wie anzunehmen 0.1 sondern 0.10000000000000009.
         * Dies entseht aufgrund der Ungenauigkeit bei Gleitkommazahlen bei einem Computer
         */
        double number1 = 1.1;
        double number2 = 1.0;
        double number3 = number1 - number2;
        boolean equals = number3 == 0.1;
        System.out.println(equals);

        /**
         * Teil b)
         * Ausgabe: 11
         * Grund: result = 3 + 3 + 5
         */
        int number = 4;
        int result = --number + number++ + ++number;
        System.out.println(result);
    }
}


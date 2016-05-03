/**
 * Aufgabe 4 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class CastingAndPromotion {
    public static void main(String args[]) {
        /**
         * Teil a)
         * Ausgabe: 987654
         * Grund: Double 987654.321 wird in ein integer konvertiert, dabei gehen die Nachkommastellen verloren!
         */
        int number = (int) 9.87654321e5;
        System.out.println(number);

        /**
         * Teil b)
         * Ausgabe: 42
         * Grund:
         * 0x1f ist Hexadezimal und entspricht 31 im Zehnersystem,
         * 0b1_1110 ist Binär und entspricht 30 im Zehnersystem
         * => 43 - 31 + 30 = 43 - 1 = 42
         */
        int number1 = 43;
        int number2 = 0x1f;
        int number3 = 0b1_1110;
        System.out.println(number1 - number2 + number3);

        /**
         * Teil c)
         * Ausgabe: 29.0
         * Grund: da 17.7 und 12.3 vor der berechnung in integer umgewandelt werder, werden die nachkommastellen abgeschnitten
         * Es wird also 17 + 12 = 29 gerechnet welches dann in ein double konvertiert wird also 29.0
         */
        double number4 = (int) 17.7 + (int) 12.3;
        float number5 = (float) number4;
        System.out.println(number5);
    }
}

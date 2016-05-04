/**
 * Aufgabe 3 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class DebugTest {
    public static void main(String[] args) {
        // Array mit Zahlen
        int[] mixedArray = {4, 43, 3, 5, 5, 46, 85, 41, 63, 8, 68, 6, 352, 36, 86, 3};

        // leeres Array fuer gerade Zahlen
        int[] evenArray = new int[mixedArray.length];

        // Hilfsvariablen
        int positionInEvenArray = 0;
        int positionInMixedArray = 0;

        while (true) {
            if (mixedArray[positionInMixedArray] % 2 == 0) {
                evenArray[positionInEvenArray] = mixedArray[positionInMixedArray];
                positionInEvenArray++;
                // position des mixed array muss auch erhöht werden, da sonst eine endlosschleife entsteht, wenn ein gerades element gefunden wird
                // dadurch wird evenArray immer weiter mit dem selben element gefüllt bis das array überläuft
                positionInMixedArray++;
                continue;
            }
            positionInMixedArray++;
            // es muss überprüft werden, ob mixedArray.length >= der position ist und nicht umgekehrt, da sonst abgebochen wird
            // wenn das array noch nicht komplett durchlaufen ist, es soll aber erst abgebrochen werden wenn mixedArray
            // komplett durchlaufen ist
            if (positionInMixedArray >= mixedArray.length)
                break;
        }
        for (int i = 0; i < evenArray.length; i++)
            System.out.println(evenArray[i]);
    }
}
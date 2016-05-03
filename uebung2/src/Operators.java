/**
 * Aufgabe 2 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class Operators {
    public static void main(String args[]) {
        // a)
        int solutiuon = (13 + 2) / (27 - 24);
        System.out.println(solutiuon); // 5

        solutiuon = 13 + 2 / 27 - 24;
        System.out.println(solutiuon); // -11, da Punkt vor Strichrechnung

        // b)
        System.out.println(13 + 12 * 7 - 2 * 2); // 93
        System.out.println((13 + 12) * (7 - 2 * 2)); // 75
    }
}

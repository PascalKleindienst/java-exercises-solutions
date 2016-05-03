/**
 * Aufgabe 2 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class BugTest { // class muss klein geschrieben werden
    /**
     * Methode mit Fehlern
     */
    public static void main(String[] args) { // eine schließende runde klammer ) anstatt einer geschweiften {
        // als Apostrophe/Anführungszeichen dürfen nur die einfachen ' und " benutzt werden. Außerdem wurde das semikolon vergessen, welches angibt das die Anweisung abgeschlossen ist
        System.out.println('*');
    }
}
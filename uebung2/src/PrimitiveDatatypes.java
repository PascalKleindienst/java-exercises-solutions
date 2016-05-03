/**
 * Aufgabe 1 Lösung
 *
 * @author pascal
 * @version 1.0
 */
public class PrimitiveDatatypes {
    public static void main(String args[]) {
        byte typeByte = 8;
        short typeShort = 32;
        int typeInt = -42;
        long typeLong = 123456789;
        float typeFloat = 123.456f;
        double typeDouble = 3.14159;
        char typeChar = 'A';
        boolean typeBoolean = false;

        System.out.println(typeByte);
        System.out.println(typeShort);
        System.out.println(typeInt);
        System.out.println(typeLong);
        System.out.println(typeFloat);
        System.out.println(typeDouble);
        System.out.println(typeChar);
        System.out.println(typeBoolean);

        // Fehler, da inkompatible typen -> datenverlust
        // typeShort = typeLong;

        // in ordnung da kompatible datentypen, ein short passt in long aber nicht umgekehrt!
        typeLong = typeShort;
    }
}

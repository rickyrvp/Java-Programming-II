
public class Smileys {
    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Arto");
         printWithSmileys("Matti");
         printWithSmileys("Mikael");
    }

    private static void printWithSmileys(String characterString) {
        String middleRow = makeMiddleRow(characterString);

        printSmiley(middleRow.length() / 2);
        System.out.println(middleRow);
        printSmiley(middleRow.length() / 2);
    }

    private static void printSmiley(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    private static String makeMiddleRow(String characterString) {
        if (characterString.length() % 2 == 1) {
            return ":) " + characterString + "  :)";
        }
        return ":) " + characterString + " :)";
    }
}

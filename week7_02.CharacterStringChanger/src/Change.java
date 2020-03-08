public class Change {
    private final char fromCharacter;
    private final char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(fromCharacter, toCharacter);
    }
}
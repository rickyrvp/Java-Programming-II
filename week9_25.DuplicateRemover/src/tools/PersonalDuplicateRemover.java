package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> entries = new HashSet<String>();
    private int duplicateCount = 0;

    @Override
    public void add(String characterString) {
        if (this.entries.contains(characterString)) {
            duplicateCount++;
        } else {
            this.entries.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.entries;
    }

    @Override
    public void empty() {
        this.entries.clear();
        this.duplicateCount = 0;
    }
}

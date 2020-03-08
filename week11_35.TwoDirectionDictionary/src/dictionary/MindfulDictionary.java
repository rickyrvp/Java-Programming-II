package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> dictionary;
    private File file;
    private Scanner reader;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.dictionary = new HashMap<String, String>();
        this.file = new File(file);
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public boolean load() {
        if (!this.reader.hasNextLine()) {
            return false;
        }
        while (this.reader.hasNextLine()) {
            String[] parts = reader.nextLine().split(":");
            add(parts[0], parts[1]);
        }
        return true;
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                writer.write(key + ":" + this.dictionary.get(key) + "\n");
            }
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
        }
    }

    public void remove(String word) {
            this.dictionary.remove(word);
            String key = getKeyByValue(this.dictionary, word);
            this.dictionary.remove(key);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            return getKeyByValue(this.dictionary, word);
        }
        return null;
    }

    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}

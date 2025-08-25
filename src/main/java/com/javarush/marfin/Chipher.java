package com.javarush.marfin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Chipher {

    public String encrypt(String inputFile, String outputFile, int key) {
        Path input = Path.of(inputFile);
        Path output = Path.of(outputFile);
        try (
                BufferedReader reader = Files.newBufferedReader(input);
                BufferedWriter writer = Files.newBufferedWriter(output);
        ) {
            int value = 0;
            int length = Alphabet.alphabet.length;
            while ((value = reader.read())!= -1) {
                char ch = (char)value;
                ch = Character.toLowerCase(ch);
                if (Alphabet.ALPHABET_MAP.containsKey(ch)) {
                    int index = Alphabet.ALPHABET_MAP.get(ch);
                    index = (index + key + Math.abs(key) * length) % length;
                    writer.write(Alphabet.alphabet[index]);
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return "файл успешно зашифрован";
    }

    public String decrypt(String text, int key) {
        return null;
    }
}

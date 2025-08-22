package com.javarush.marfin;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    protected static final Map<Character, Integer> ALPHABET_MAP = new HashMap<>();
    static {
        for (int i = 0; i < ALPHABET.length; i++) {
            ALPHABET_MAP.put(ALPHABET[i], i);

        }
    }
}

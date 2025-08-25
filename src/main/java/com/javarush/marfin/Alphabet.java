package com.javarush.marfin;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    public static final char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    protected static final Map<Character, Integer> ALPHABET_MAP = new HashMap<>();
    static {
        for (int i = 0; i < alphabet.length; i++) {
            ALPHABET_MAP.put(alphabet[i], i);

        }
    }
}

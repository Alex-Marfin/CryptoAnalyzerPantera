package com.javarush.marfin;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static class Chipher {
        Map<Character, Integer> alphabetMap;
        public Chipher(Map<Character, Integer> alphabetMap) {
            this.alphabetMap =  alphabetMap;
        }
        public String encrypt(String text, int key) {
            return null;
        }

        public String decrypt(String text, int key) {
            return null;
        }
    }








    public static void main(String[] args) {
        Chipher ch = new Chipher(Alphabet.ALPHABET_MAP);
    }
}

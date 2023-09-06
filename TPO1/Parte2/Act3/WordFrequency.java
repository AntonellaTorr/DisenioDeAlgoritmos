package Parte2.Act3;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Convertimos el texto a minúsculas y dividimos en palabras
        String[] words = text.toLowerCase().split("\\W+");

        // Contamos la frecuencia de las palabras usando un hash
        for (String word : words) {
            if (!word.isEmpty()) {
                //a la cantidad de repeticiones que ya estaban le sumo 1 
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String texto = "Este es un ejemplo de texto. Es un ejemplo sencillo pero util.";
        Map<String, Integer> frecuencias = wordFrequency(texto);

        // Mostramos las palabras y sus frecuencias
        for (Map.Entry<String, Integer> entry : frecuencias.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }
    }
}

package src;

import java.util.Random;

public class GeradorDeDados {

    public static int[] gerarOrdenado(int tamanho) {
        int[] dados = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dados[i] = i;
        }
        return dados;
    }

    public static int[] gerarInversamenteOrdenado(int tamanho) {
        int[] dados = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dados[i] = (tamanho - 1) - i;
        }
        return dados;
    }

    public static int[] gerarAleatorio(int tamanho) {
        int[] dados = new int[tamanho];
        Random random = new Random();
        
        for (int i = 0; i < tamanho; i++) {
            dados[i] = random.nextInt(tamanho * 2);
        }
        return dados;
    }
}